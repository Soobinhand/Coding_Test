package BOJ.Back_Tracking;

import java.util.Scanner;

public class S3_15649 {

    static int n;
    static int m;
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        visit = new boolean[n];
        dfs(0);
    }

    static void dfs(int depth){
        if (depth == m){
            for (int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i=0;i<n;i++){
            if (!visit[i]){
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
