package BOJ.PrefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[][] S = new int[N+1][N+1];
        for(int i=1; i<=N;i++){
            stringTokenizer = new StringTokenizer(br.readLine());
            for (int j=1;j<=N;j++){
                S[i][j] = S[i][j-1] + Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        for (int i=0;i<M;i++){
            int answer = 0;
            stringTokenizer = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stringTokenizer.nextToken());
            int min = Integer.parseInt(stringTokenizer.nextToken());
            int end = Integer.parseInt(stringTokenizer.nextToken());
            int max = Integer.parseInt(stringTokenizer.nextToken());
            if (start == end){
                answer = (S[start][max] - S[end][min-1]);
            }else {
                for (int j = start; j <= end; j++) {
                    answer += (S[j][max] - S[j][min-1]);
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
