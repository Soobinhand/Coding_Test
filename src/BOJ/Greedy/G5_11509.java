package BOJ.Greedy;

import java.util.Scanner;

public class G5_11509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[10000001];
        int input, result = 0;
        for (int i=0;i<N;i++){
            input = sc.nextInt();
            if (arr[input + 1] == 0){
                arr[input]++;
                result++;
            }else{
                arr[input + 1]--;
                arr[input]++;
            }
        }
        System.out.println(result);
    }
}
