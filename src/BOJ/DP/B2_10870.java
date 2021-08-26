package BOJ.DP;

import java.util.Scanner;

public class B2_10870 {
    static int[] memo;

    public static int f(int n){
        if(n<=1) return n;
        return memo[n] = f(n-1)+f(n-2);
    }
    public static void main(String[] args){
        memo = new int[101];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f(n));
    }
}
