package BOJ.Greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class G5_1374 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        PriorityQueue<Integer> start = new PriorityQueue<>();
        PriorityQueue<Integer> end = new PriorityQueue<>();
        int count = 0;
        for (int i=0;i<a;i++){
            sc.nextInt();
            start.add(sc.nextInt());
            end.add(sc.nextInt());
        }
        while (!start.isEmpty()){
            if (start.peek() < end.peek()){
                count++;
                start.poll();
            }else{
                start.poll();
                end.poll();
            }
        }
        System.out.println(count);
    }
}
