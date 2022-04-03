package BOJ.Greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class S5_16208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum = 0;
        for (int i=0;i<n;i++){
            int temp = sc.nextInt();
            sum += temp;
            pq.add(temp);
        }
        long answer = 0;
        for (int i=0;i<n;i++){
            int temp = pq.poll();
            sum -= temp;
            answer += ((long) sum * temp);
        }
        System.out.println(answer);
    }
}
