package BOJ.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class S3_1449 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int left = arr[0];

        int answer = 1;

        for (int i=0;i<a;i++){
            if (left + b <= arr[i]){
                answer++;
                left = arr[i];
            }
        }

        System.out.println(answer);
    }
}
