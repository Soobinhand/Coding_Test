package BOJ.DP;

import java.util.Arrays;
import java.util.Scanner;

public class S2_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[a];
        dp[0] = arr[0];
        for (int i=1;i<a;i++){
            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
        }
        Arrays.sort(dp);
        System.out.println(dp[dp.length-1]);
    }
}
