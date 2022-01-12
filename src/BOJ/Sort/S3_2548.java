package BOJ.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class S3_2548 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int aa = 0;
        int al = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            int sum = 0;
            for (int j=0;j<arr.length;j++){
                sum += Math.abs(arr[i] - arr[j]);
            }
            if (al == sum){
                continue;
            }
            min = Math.min(min, sum);
            if (min == sum){
                aa = arr[i];
            }
            al = sum;
        }
        System.out.println(aa);
    }
}
