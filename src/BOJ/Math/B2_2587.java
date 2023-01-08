package BOJ.Math;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B2_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int mean = 0;
        for (int i=0;i<5;i++){
            int a = sc.nextInt();
            priorityQueue.add(a);
            mean += a;
        }
        mean /= 5;
        priorityQueue.remove();
        priorityQueue.remove();
        int c = priorityQueue.remove();
        System.out.println(mean);
        System.out.println(c);
    }
}
