package BOJ.Math;

import java.util.Scanner;

public class S3_3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ringNum = sc.nextInt();
        int[] rings = new int[ringNum];
        for (int i=0;i<ringNum;i++){
            rings[i] = sc.nextInt();
        }
        int firstRing = rings[0];
        for (int i=1;i<ringNum;i++){
            int rest = GCD(firstRing, rings[i]);
            System.out.println(firstRing/rest +"/"+rings[i]/rest);
        }
    }

    public static int GCD(int a, int b){
        if (a%b == 0) return b;
        return GCD(b, a%b);
    }
}
