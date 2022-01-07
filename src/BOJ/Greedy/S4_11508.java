package BOJ.Greedy;

import java.util.*;

public class S4_11508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<a;i++){
            list.add(sc.nextInt());
        }

        list.sort(Collections.reverseOrder());
        int sum = 0;
        for (int i=0;i<list.size();i++){
            if (i%3==2) continue;
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
