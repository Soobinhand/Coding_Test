package BOJ.Greedy;

import java.util.Scanner;

public class B3_11034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int[] kangaroo = new int[3];
            kangaroo[0] = sc.nextInt();
            kangaroo[1] = sc.nextInt();
            kangaroo[2] = sc.nextInt();
            int distance1 = kangaroo[1] - kangaroo[0];
            int distance2 = kangaroo[2] - kangaroo[1];
            System.out.println(Math.max(distance1, distance2) - 1);
        }
    }
}