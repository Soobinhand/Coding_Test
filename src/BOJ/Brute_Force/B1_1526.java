package BOJ.Brute_Force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1526 {
    static int a;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        for (int i = 4;i<=a;i++){
            if (String.valueOf(i).contains("1") || String.valueOf(i).contains("2")
            || String.valueOf(i).contains("3") ||String.valueOf(i).contains("5") ||
                    String.valueOf(i).contains("6") ||String.valueOf(i).contains("8") ||
                    String.valueOf(i).contains("9") ||String.valueOf(i).contains("0")){
                continue;
            }
            max = i;
        }
        System.out.println(max);
    }
}
