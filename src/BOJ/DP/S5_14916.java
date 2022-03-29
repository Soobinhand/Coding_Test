package BOJ.DP;

import java.util.Scanner;

public class S5_14916 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int answer = 0;
        while (a > 0) {
            if (a % 5==0){
                answer += a/5;
                break;
            }
            a -= 2;
            answer++;
        }
        if (a < 0){
            System.out.println(-1);
        }else{
            System.out.println(answer);
        }
    }
}
