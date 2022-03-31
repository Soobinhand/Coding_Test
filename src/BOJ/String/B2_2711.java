package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i=0;i<testCase;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder();
            String str = st.nextToken();
            for (int j=0;j<str.length();j++){
                if (j == number - 1){
                    continue;
                }
                sb.append(str.charAt(j));
            }
            System.out.println(sb);
        }
    }
}
