package BOJ.PrefixSum;

import java.util.Scanner;

public class S3_11441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr= new int[a+1];
        for (int i=1;i<a+1;i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }
        int b = sc.nextInt();
        while (b --> 0){
            int left = sc.nextInt();
            int right = sc.nextInt();
            System.out.println(arr[right] - arr[left-1]);
        }
    }
}
