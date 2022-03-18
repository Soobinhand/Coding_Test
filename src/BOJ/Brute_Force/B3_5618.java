package BOJ.Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class B3_5618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=arr[0];i++){
            int count = 0;
            for (int j=0;j<arr.length;j++){
                if (arr[j] % i == 0){
                    count++;
                }
            }
            if (count == arr.length){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
