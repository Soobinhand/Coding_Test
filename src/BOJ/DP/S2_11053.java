package BOJ.DP;

import java.util.*;

public class S2_11053 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] dp = new int[a+1];
        int[] arr = new int[a+1];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
            dp[i] = 1;
        }
        for (int i=0;i<a;i++){
            for (int j=0;j<=i;j++){
                if (arr[j] < arr[i] && dp[j] >= dp[i]){
                    dp[i] = dp[j]+1;
                }
            }
        }

        Arrays.sort(dp);
        System.out.println(dp[dp.length-1]);
    }
}
