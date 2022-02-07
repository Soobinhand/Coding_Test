package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B2_10822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),",");
        int sum = 0;
        while (st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
