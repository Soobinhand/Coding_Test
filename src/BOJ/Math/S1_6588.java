package BOJ.Math;

import java.util.Arrays;
import java.util.Scanner;

public class S1_6588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] flag = new boolean[1000001];
        Arrays.fill(flag, true);
        for (int i = 3; i< flag.length; i++){
            if (flag[i]){
                for (int j = i+i; j<flag.length; j=j+i){
                    flag[j] = false;
                }
            }
        }
        while (true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            for (int i=3;i< flag.length;i++){
                if (flag[i] && flag[n-i]){
                    System.out.println(n + " = " + i + " + " + (n-i));
                    break;
                }
            }
        }
    }

}
