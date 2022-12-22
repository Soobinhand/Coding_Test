package BOJ.DP;

import java.util.Scanner;

public class S3_11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1001];
        int[] b = new int[1001];
        int[] c = new int[1001];
        int[] result = new int[1001];
        a[0] = 0;
        b[0] = 0;
        c[0] = 0;
        result[0] = 0;
        a[1] = 0;
        b[1] = 1;
        c[1] = 0;
        result[1] = 1;
        a[2] = 1;
        b[2] = 1;
        c[2] = 1;
        result[2] = 3;
        for (int i = 3; i <=n;i++){
            a[i] = b[i-1];
            b[i] = result[i-1];
            c[i] = b[i-1];
            result[i] = (a[i]+b[i]+c[i])%10007;
        }
        System.out.println(result[n]);
    }
}
