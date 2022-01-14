package BOJ.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S3_5545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int dough_price = sc.nextInt();
        int topping_price = sc.nextInt();
        int dough_calorie = sc.nextInt();
        ArrayList<Integer> topping_calorie = new ArrayList<>();
        for (int i=0;i<a;i++){
            topping_calorie.add(sc.nextInt());
        }
        topping_calorie.sort(Collections.reverseOrder());
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(dough_calorie / dough_price);
        int tmp;
        for (int i=0;i<a;i++){
            tmp = (dough_calorie);
            for (int j=0;j<=i;j++){
                tmp += (topping_calorie.get(j));
            }
            answer.add(tmp/(dough_price+(i+1)*topping_price));
        }
        System.out.println(answer);
        System.out.println(Collections.max(answer));
    }
}
