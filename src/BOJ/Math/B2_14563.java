package BOJ.Math;

import java.util.Scanner;

public class B2_14563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0;i<a;i++){
            int c = sc.nextInt();
            int sum = 0;
            for (int j=1;j<c;j++){
                if (c % j == 0){
                    sum += j;
                }
            }
            if (sum == c){
                System.out.println("Perfect");
            }else if(sum > c){
                System.out.println("Abundant");
            }else{
                System.out.println("Deficient");
            }
        }

    }
}
