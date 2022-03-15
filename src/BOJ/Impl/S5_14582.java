package BOJ.Impl;

import java.util.Scanner;

public class S5_14582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lose = new int[9];
        int[] win = new int[9];
        for (int i=0;i<lose.length;i++){
            lose[i] = sc.nextInt();
        }
        for (int i=0;i< win.length;i++){
            win[i] = sc.nextInt();
        }
        int loseScore = 0;
        int winScore = 0;
        for (int i=0;i<win.length;i++){
            loseScore += lose[i];
            if (loseScore > winScore){
                System.out.println("Yes");
                System.exit(0);
            }
            winScore += win[i];
        }
        System.out.println("No");
    }
}
