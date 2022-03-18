package BOJ.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int i=0;i<num;i++){
            String str = br.readLine();
            if (str.charAt(str.length() - 1) == '1' ||
                str.charAt(str.length() - 1) == '3' ||
                str.charAt(str.length() - 1) == '5' ||
                str.charAt(str.length() - 1) == '7' ||
                str.charAt(str.length() - 1) == '9'){
                System.out.println("odd");
            }else{
                System.out.println("even");
            }
        }
    }
}
