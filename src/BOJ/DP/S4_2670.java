package BOJ.DP;

import java.util.Arrays;
import java.util.Scanner;

public class S4_2670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        double[] arr = new double[testCase];
        double[] dp = new double[testCase];
        for (int i=0;i<testCase;i++){
            arr[i] = sc.nextDouble();
        }
        for (int i=0;i<testCase;i++){
            double max = arr[i];
            dp[i] = arr[i];
            for (int j=i+1;j<testCase;j++){
                dp[i] = Math.max(max, dp[i]);
                max *= arr[j];
            }
        }
        Arrays.sort(dp);
        System.out.printf("%.3f%n", dp[dp.length-1]);
    }
}
