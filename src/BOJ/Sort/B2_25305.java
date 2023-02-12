package BOJ.Sort;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B2_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> score = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++){
            score.add(sc.nextInt());
        }
        for (int i = 0; i < k-1; i++){
            score.poll();
        }
        System.out.println(score.peek());
    }
}
