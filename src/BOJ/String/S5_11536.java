package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class S5_11536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        String[] str = new String[testCase];
        String[] sortStr = new String[testCase];
        boolean increase = false;
        boolean decrease = false;
        for (int i=0;i<testCase;i++){
            str[i] = sortStr[i] = br.readLine();
        }
        Arrays.sort(sortStr);
        for (int i=0;i<testCase;i++){
            if (Objects.equals(sortStr[i], str[i])){
                increase = true;
            }else{
                increase = false;
                break;
            }
        }
        if (increase){
            System.out.println("INCREASING");
            System.exit(0);
        }
        for (int i=0;i<testCase;i++){
            if (sortStr[testCase-1-i].equals(str[i])){
                decrease = true;
            }else{
                decrease = false;
                break;
            }
        }
        if (decrease){
            System.out.println("DECREASING");
            System.exit(0);
        }
        System.out.println("NEITHER");
    }
}
