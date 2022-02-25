package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G5_5582 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int max = 0;
        int[][] findMax = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 1; i <= str1.length(); i++){
            for (int j = 1; j <= str2.length(); j++){
                if (str1.charAt(i - 1) == str2.charAt(j - 1)){
                    findMax[i][j] = findMax[i-1][j-1] + 1;
                    max = Math.max(max, findMax[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}
