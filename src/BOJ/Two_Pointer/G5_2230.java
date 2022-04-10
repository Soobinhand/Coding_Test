package BOJ.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class G5_2230 {
    static int N;
    static int M;
    static int[] arr;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left = 0;
        int right = 0;
        while (left < N){
            if (arr[left] - arr[right] < M){
                left++;
                continue;
            }
            if (arr[left] - arr[right] == M){
                min = M;
                break;
            }
            min = Math.min(min, arr[left] - arr[right]);
            right++;
        }
        System.out.println(min);
    }
}
