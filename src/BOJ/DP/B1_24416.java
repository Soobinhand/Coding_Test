package BOJ.DP;

import java.util.Scanner;

public class B1_24416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.print(recursiveFibonacci(input)+" "+dynamicFibonacci(input));
    }
    private static int recursiveFibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return (recursiveFibonacci(n-1) + recursiveFibonacci(n-2));
        }
    }

    private static int dynamicFibonacci(int n){
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        int a = 0;
        for (int i=3;i<arr.length;i++){
            a++;
            arr[i] = arr[i-1] + arr[i-2];
        }
        return a;
    }
}
