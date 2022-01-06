package BOJ.Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class S2_11279 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=0;i<a;i++){
            int b = sc.nextInt();
            if (b == 0){
                if (pq.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.add(b);
            }
        }
    }
}