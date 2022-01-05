package BOJ.Math;

import java.util.Scanner;

public class S4_2960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] isPrime = new boolean[n+1];
        int count = 0;
        for (int i = 2;i<=n;i++){
            for (int j = i;j<=n;j+=i){
                if (!isPrime[j]){
                    count++;
                    isPrime[j] = true;
                }
                if (count == k){
                    System.out.println(j);
                    System.exit(0);
                }
            }
        }
    }

}
