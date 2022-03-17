package BOJ.Math;

import java.util.Scanner;

public class B4_5532_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        double C = sc.nextDouble();
        double D = sc.nextDouble();
        int max;
        int korean = (int) Math.ceil(A / C);
        int math = (int) Math.ceil(B/D);
        max = Math.max(korean, math);
        int answer = L - max;
        System.out.println(answer);
    }
}
