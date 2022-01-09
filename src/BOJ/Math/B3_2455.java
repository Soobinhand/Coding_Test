package BOJ.Math;

import java.util.Arrays;
import java.util.Scanner;

public class B3_2455 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = Math.abs(sc.nextInt() - sc.nextInt());
        for (int i=1;i<4;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = arr[i-1] + b-a;
        }
        Arrays.sort(arr);
        System.out.println(arr[3]);
    }

}
