package BOJ.Greedy;

import java.util.*;

public class S4_1049 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> six = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();
        for (int i=0;i<b;i++){
            six.add(sc.nextInt());
            one.add(sc.nextInt());
        }
        Collections.sort(six);
        Collections.sort(one);
        int answer;
        int six_min = six.get(0);
        int one_min = one.get(0);
        answer = Math.min(six_min*((a/6)+1),
                Math.min(a*one_min, (a/6)*six_min + (a%6)*one_min));
        System.out.println(answer);
    }
}