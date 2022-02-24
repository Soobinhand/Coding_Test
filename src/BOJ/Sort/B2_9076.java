package BOJ.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class B2_9076 {
    static int T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T --> 0){
            int[] arr = new int[5];
            for (int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[3] - arr[1] >= 4){
                System.out.println("KIN");
            }else{
                int sum = arr[1] + arr[2] + arr[3];
                System.out.println(sum);
            }
        }
    }
}
