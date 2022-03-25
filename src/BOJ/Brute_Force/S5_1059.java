package BOJ.Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class S5_1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();
        int min = 0;
        int max = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == target){
                System.out.println(0);
                System.exit(0);
            }else if (arr[i] < target){
                min = Math.max(min, arr[i]);
            }else{
                max = Math.min(max, arr[i]);
            }
        }
        int cnt = 0;
        for (int i = min+1;i<=target;i++){
            for (int j=target;j<=max-1;j++){
                if (i != j){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
