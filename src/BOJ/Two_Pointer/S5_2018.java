package BOJ.Two_Pointer;

import java.util.Scanner;

public class S5_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = 1;
        int end = 1;
        int answer = 1; // 자기 자신을 제외하고 세기 때문.
        int sum = 1;
        while(end != N){
            if (sum < N){
                end++;
                sum += end;
            }else if(sum > N){
                sum -= start;
                start++;
            }else {
                answer++;
                end++;
                sum += end;
            }
        }
        System.out.println(answer);
    }
}
