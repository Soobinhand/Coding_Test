package BOJ.Math;

import java.util.Scanner;

public class B1_1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = (int)Math.ceil(Math.sqrt(m));

        for (int i = min; i<=Math.floor(Math.sqrt(n));i++){
            sum += Math.pow(i, 2);
        }
        if (sum >0){
            System.out.println(sum);
            System.out.println((int)Math.pow(min, 2));
        }else{
            System.out.println(-1);
        }
    }
}
