package BOJ.Math;

import java.util.Scanner;

public class B2_13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        long answer = 0;
        for (int i=0;i<a;i++){
            arr[i] -= b;
            answer++;
            if (arr[i] <= 0){
                continue;
            }
            else{
                answer += arr[i]/c;
                if (arr[i] % c > 0){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
