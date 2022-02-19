package BOJ.Math;

import java.util.Scanner;

public class S5_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int stick = 64;
        int answer = 0;

        while (x > 0){
            if (stick > x){
                stick /= 2;
            }else{
                x -= stick;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
