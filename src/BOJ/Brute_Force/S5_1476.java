package BOJ.Brute_Force;

import java.util.Scanner;

public class S5_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while (arr[1] != a || arr[2] != b || arr[3] != c) {
            arr[1]++;
            arr[2]++;
            arr[3]++;
            if (arr[1] == 16) {
                arr[1] = 1;
            }
            if (arr[2] == 29) {
                arr[2] = 1;
            }
            if (arr[3] == 20) {
                arr[3] = 1;
            }
            arr[0]++;
        }
        System.out.println(arr[0]);
    }
}
