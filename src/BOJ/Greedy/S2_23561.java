package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class S2_23561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int testCase = a*3;
        int[] arr = new int[testCase];
        for (int i=0;i<testCase;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[testCase-a-1] - arr[a]);
    }
}
