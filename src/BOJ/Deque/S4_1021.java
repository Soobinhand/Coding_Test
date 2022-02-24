package BOJ.Deque;

import java.util.LinkedList;
import java.util.Scanner;

public class S4_1021 {
    static int n;
    static int m;
    static LinkedList<Integer> deque = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i=1;i<=n;i++){
            deque.add(i);
        }
        int count = 0;
        while (m -- >0){
            int temp = sc.nextInt();
            while (true){
                if (deque.getFirst() == temp){
                    deque.pollFirst();
                    break;
                }
                if (deque.indexOf(temp) <= deque.size() / 2){
                    deque.addLast(deque.pollFirst());
                }else{
                    deque.addFirst(deque.pollLast());
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
