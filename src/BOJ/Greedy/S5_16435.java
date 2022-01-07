package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class S5_16435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;i<a;i++){
            if (b >= arr[i]){
                b++;
            }else
                break;
        }
        System.out.println(b);

    }
}
