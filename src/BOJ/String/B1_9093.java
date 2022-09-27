package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i<testCase;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();
            while (st.hasMoreTokens()){
                StringBuilder temp = new StringBuilder(st.nextToken());
                temp.reverse();
                sb.append(temp).append(" ");
            }
            System.out.println(sb);
        }
    }
}
