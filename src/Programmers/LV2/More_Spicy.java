package Programmers.LV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class More_Spicy {
    public static void main(String[] args) {
        More_Spicy more_spicy = new More_Spicy();
        int[] scoville = new int[]{1,2,3,9,10,12};
        int k = 7;
        System.out.println(more_spicy.solution(scoville, k));
    }
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : scoville){
            queue.offer(i);
        }
        while (queue.peek() <= K){
            if (queue.size() == 1){
                return -1;
            }
            int a = queue.poll();
            int b = queue.poll();

            int result = a + (b*2);
            queue.offer(result);
            answer++;
        }

        return answer;
    }
}
