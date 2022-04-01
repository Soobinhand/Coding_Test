package BOJ.Math;

import java.util.Scanner;

public class S3_9613 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i=0;i<testCase;i++){
            int testCase2 = sc.nextInt();
            int[] arr = new int[testCase2];
            for (int j=0;j<testCase2;j++){
                arr[j] = sc.nextInt();
            }
            long answer = 0;
            for (int j=0;j<testCase2-1;j++){
                for (int k = j+1;k<testCase2;k++){
                    answer += GCD(arr[j], arr[k]);
                }
            }
            System.out.println(answer);
        }
    }
    static int GCD(int a, int b){
        if (b == 0) return a;
        return GCD(b, a%b);
    }
}
