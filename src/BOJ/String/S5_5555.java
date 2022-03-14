package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        int testCase = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i=0;i<testCase;i++){
            String ringString = br.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append(ringString).append(ringString);
            if (sb.toString().contains(target)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
