package BOJ.Two_Pointer;

import java.util.Scanner;

public class G5_2467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i]  = sc.nextInt();
        }
        int left = 0;
        int right = a-1;
        int min_left = 0, min_right = 0;
        long min = Long.MAX_VALUE;
        while (left < right){
            long sum = arr[left] + arr[right];
            if (Math.abs(sum) < min){
                min = Math.abs(sum);
                min_left = left;
                min_right = right;
            }
            if (sum >= 0){
                right--;
            }else{
                left++;
            }
        }
        System.out.println(arr[min_left] +" " + arr[min_right]);
    }
}
