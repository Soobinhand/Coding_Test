package BOJ.Impl;

import java.util.ArrayList;
import java.util.Scanner;

public class B2_2979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt() * 2;
        int three = sc.nextInt() * 3;
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> third = new ArrayList<>();
        int firstMin = sc.nextInt();
        int firstMax = sc.nextInt() - 1;
        int secondMin = sc.nextInt();
        int secondMax = sc.nextInt() - 1;
        int thirdMin = sc.nextInt();
        int thirdMax = sc.nextInt() - 1;
        for (int i = firstMin; i<= firstMax;i++){
            first.add(i);
        }
        for (int i = secondMin; i<= secondMax;i++){
            second.add(i);
        }
        for (int i = thirdMin; i<= thirdMax;i++){
            third.add(i);
        }
        int min = Math.min(first.get(0), Math.min(second.get(0), third.get(0)));
        int max = Math.max(firstMax, Math.max(secondMax,thirdMax));
        int answer = 0;
        for (int i=min;i<=max;i++){
            int count = 0;
            if (first.contains(i)) count++;
            if (second.contains(i)) count++;
            if (third.contains(i)) count++;
            if (count == 1){
                answer += one;
            }else if (count == 2){
                answer += two;
            }else if (count == 3){
                answer += three;
            }
        }
        System.out.println(answer);
    }
}
