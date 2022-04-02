package BOJ.Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class S3_14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] date = new int[testCase + 1];
        int[] cost = new int[testCase + 1];
        int[] dp = new int[testCase + 2];
        for (int i=1;i<testCase + 1;i++){
            date[i] = sc.nextInt();
            cost[i] = sc.nextInt();
        }
        for (int i = testCase; i > 0; i--){
            int index = i + date[i];
            if (index > testCase + 1){
                dp[i] = dp[i+1];
            }else{
                dp[i] = Math.max(dp[i+1], cost[i] + dp[index]);
            }
        }
        System.out.println(dp[1]);
    }
}
