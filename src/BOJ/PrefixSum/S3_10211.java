package BOJ.PrefixSum;

import java.util.Scanner;

public class S3_10211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase --> 0){
            int b = sc.nextInt();
            int[] arr = new int[b];
            int[] dp = new int[b];
            for (int i=0;i<b;i++){
                arr[i] = sc.nextInt();
            }
            dp[0] = arr[0];
            int max = arr[0];
            for (int i=1;i<b;i++){
                if (dp[i-1] < 0) dp[i-1] = 0;
                dp[i] = dp[i-1] + arr[i];
                max = Math.max(max, dp[i]);
            }
            System.out.println(max);
        }
    }
}
