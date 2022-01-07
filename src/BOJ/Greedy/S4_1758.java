package BOJ.Greedy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class S4_1758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<a;i++){
            pq.add(sc.nextLong());
        }
        long sum = 0;
        for (int i=0;i<a;i++){
            if (!pq.isEmpty()){
                if (pq.peek() - i > 0) sum += (pq.poll()-i);
            }
        }
        System.out.println(sum);
    }
}
