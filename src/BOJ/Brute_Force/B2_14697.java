package BOJ.Brute_Force;

import java.util.Scanner;

public class B2_14697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int[] arr = new int[3];
        for (int i=0;i<3;i++){
            arr[i] = sc.nextInt();
        }
        int total = sc.nextInt();
        for (int i=0;i<=50;i++){
            for (int j=0;j<=50;j++){
                for (int k=0;k<=50;k++){
                    if (arr[0] * i + arr[1] * j + arr[2] * k == total){
                        answer = 1;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}