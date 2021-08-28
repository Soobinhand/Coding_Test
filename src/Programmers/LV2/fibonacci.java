package Programmers.LV2;

public class fibonacci {
    static int[] dp = new int[100001];
    public int solution(int n) {
        int answer = 0;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 3;
        for (int i=5;i<dp.length;i++){
            dp[i] = (dp[i-1]+dp[i-2])%1234567;
        }
        answer = dp[n];
        return answer;
    }

}
