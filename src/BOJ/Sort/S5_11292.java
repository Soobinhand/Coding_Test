package BOJ.Sort;

import java.io.IOException;
import java.util.Scanner;

public class S5_11292 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true){
            int test = sc.nextInt();
            if (test == 0){
                break;
            }
            String[][] str = new String[test][2];
            double max = 0;
            for (int i=0;i<test;i++){
                str[i][0] = sc.next();
                str[i][1] = sc.next();
                max = Math.max(Double.parseDouble(str[i][1]), max);
            }
            String name = "";
            for (int i=0;i<test;i++){
                if (Double.parseDouble(str[i][1]) == max){
                    name += str[i][0] +" ";
                }
            }
            System.out.println(name);
        }
    }
}
