package BOJ.Impl;

import java.util.Scanner;

public class B1_2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int[][] arrr = new int[k][4];
        for (int i=0;i<k;i++){
            for (int j=0;j<4;j++){
                arrr[i][j] = sc.nextInt();
            }
        }
        int sum;
        for (int i=0;i<k;i++){
            sum = 0;
            for (int j=arrr[i][0]; j <= arrr[i][2];j++){
                for (int q = arrr[i][1]; q <= arrr[i][3]; q++){
                    sum += (arr[j-1][q-1]);
                }
            }
            System.out.println(sum);
        }
    }
}
