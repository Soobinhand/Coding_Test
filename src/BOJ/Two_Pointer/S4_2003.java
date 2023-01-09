package BOJ.Two_Pointer;

import java.util.Scanner;

public class S4_2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); // 합이 M이되어야함.
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int answer = 0;
        int a = 0, b = 0;
        int sum = 0;
        while (true){
            if(sum >= M){
                sum -= arr[a];
                a++;
            }else if (b == N){
                break;
            }else {
                sum += arr[b];
                b++;
            }
            if(sum == M){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
