package BOJ.Simulation;

import java.util.Scanner;

public class B3_1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ballLocation = 1;
        while (a --> 0){
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (b == ballLocation){
                ballLocation = c;
            }else if (c == ballLocation){
                ballLocation = b;
            }
        }
        System.out.println(ballLocation);
    }
}