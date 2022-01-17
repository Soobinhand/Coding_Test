package BOJ.Greedy;

import java.util.Scanner;

public class S5_17262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  =sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<a;i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            if (s > max){
                max = s;
            }
            if (e < min){
                min = e;
            }
        }
        if (max - min < 0) System.out.println(0);
        else System.out.println(max - min);

    }
}
