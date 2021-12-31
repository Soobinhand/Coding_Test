package BOJ.Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class S3_1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long max = arr[a-1];
        long min = 1;
        long mid;

        while(min <= max){
            mid = (min+max)/2;
            long total = 0;
            for (int i=0;i<arr.length;i++){
                total += arr[i]/mid;
            }
            if (total >= b){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        System.out.println(max);
    }
}
