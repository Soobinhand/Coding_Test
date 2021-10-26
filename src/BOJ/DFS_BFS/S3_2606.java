package BOJ.DFS_BFS;

import java.io.IOException;
import java.util.Scanner;

public class S3_2606 {
    static int[][] node;
    static boolean[] visit;
    static int n,m;
    static int result = 0;

    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //7
        m = sc.nextInt(); //6

        node = new int[n+1][n+1];
        visit = new boolean[n+1];

        int num1, num2;

        for(int i=0;i<m;i++){
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            node[num1][num2] = node[num2][num1] = 1;
        }
        dfs(1);
        System.out.println(result);

    }

    public static void dfs(int d){
        visit[d] = true;
        for(int i=1;i<n+1;i++){
            if(node[d][i]==1&&!visit[i]){
                result++;
                dfs(i);
            }
        }
    }
}
