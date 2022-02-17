package BOJ.TSP;

import java.util.Scanner;

public class S2_10971 {
    static int n;
    static int[][] arr;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        visit = new boolean[n];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            visit[i] = true;
            dfs(i,i,0,0);
            visit[i] = false;
        }
        System.out.println(min);
    }
    static void dfs(int start, int now, int sum, int depth){
        if (depth == n-1){
            if (arr[now][start] != 0){
                sum += arr[now][start];
                if (sum < min) min = sum;
            }
            return;
        }
        for (int i=0;i<n;i++){
            if (!visit[i] && arr[now][i] != 0){
                visit[i] = true;
                dfs(start, i, sum+arr[now][i],depth+1);
                visit[i] = false;
            }
        }
    }
}
