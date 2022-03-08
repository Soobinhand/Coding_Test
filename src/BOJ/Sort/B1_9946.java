package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1_9946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (true){
            String original = br.readLine();
            String broken = br.readLine();
            i++;
            if (original.equals("END") && broken.equals("END")){
                break;
            }
            char[] originalChars = original.toCharArray();
            char[] brokenChars = broken.toCharArray();
            Arrays.sort(originalChars);
            Arrays.sort(brokenChars);
            if (Arrays.equals(originalChars, brokenChars)){
                System.out.println("Case "+i+":"+" same");
            }else{
                System.out.println("Case "+i+":"+" different");

            }
        }
    }
}
