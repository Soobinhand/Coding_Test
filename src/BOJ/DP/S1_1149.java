package BOJ.DP;

import java.util.Scanner;

public class S1_1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][3];
        for (int i=0;i<a;i++){
            for (int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[a][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];
        for (int i=1;i<a;i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
        }
        System.out.println(Math.min(dp[a-1][0], Math.min(dp[a-1][1], dp[a-1][2])));
    }
}
