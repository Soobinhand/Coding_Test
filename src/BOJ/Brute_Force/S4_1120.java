package BOJ.Brute_Force;

import java.io.IOException;
import java.util.Scanner;

public class S4_1120 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int len = b.length() - a.length() + 1;
        int answer = Integer.MAX_VALUE;
        for (int i=0;i<len;i++){
            int count = 0;
            for (int j=0;j<a.length();j++){
                String ba = b.substring(i, i+a.length());
                if (a.charAt(j) != ba.charAt(j)){
                    count++;
                }
            }
            answer = Math.min(answer, count);
        }
        System.out.println(answer);
    }
}
