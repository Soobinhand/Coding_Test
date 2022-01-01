package BOJ.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class S5_5800 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0;i<a;i++){
            int k = sc.nextInt();
            int[] arr = new int[k];
            for (int j=0;j<k;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int max = 0;
            for (int j=0;j<arr.length-1;j++){
                max = Math.max(max, Math.abs(arr[j]-arr[j+1]));
            }
            System.out.println("Class "+(i+1));
            System.out.println("Max "+ arr[k-1]+", Min "+arr[0]+", Largest gap "+max);
        }
    }
}
