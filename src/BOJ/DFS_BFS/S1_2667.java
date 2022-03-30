package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class S1_2667 {
    static int a;
    static int[][] arr;
    static int answer = 0;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static ArrayList<Integer> result = new ArrayList<>();
    static boolean[][] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        arr = new int[a][a];
        check = new boolean[a][a];
        for (int i=0;i<a;i++){
            String str = br.readLine();
            for (int j=0;j<a;j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                if (arr[i][j] == 1 && !check[i][j]){
                    answer = 1;
                    search(i,j);
                    result.add(answer);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int c : result) System.out.println(c);
    }
    static int search(int x, int y){
        check[x][y] = true;
        for (int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < a && ny <a){
                if (arr[nx][ny] == 1 && !check[nx][ny]){
                    search(nx, ny);
                    answer++;
                }
            }
        }
        return answer;
    }
}
