package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1_6996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i=0;i<testCase;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            if (Arrays.equals(char1, char2)){
                System.out.println(str1+ " & " +str2+ " are anagrams.");
            }else{
                System.out.println(str1+ " & " +str2+ " are NOT anagrams.");
            }
        }
    }
}
