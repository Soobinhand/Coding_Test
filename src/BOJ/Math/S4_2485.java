package BOJ.Math;

import java.util.Scanner;

public class S4_2485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int min = 0;
        int gcd = 0;
        for (int i=1;i<a;i++){
            min = arr[i] - arr[i-1];
            gcd = GCD(min, gcd);
        }
        System.out.println((arr[a-1] - arr[0]) / gcd+1-(arr.length));
    }
    static int GCD(int a, int b){
        if (b == 0) return a;
        else return GCD(b,a%b);
    }
}
