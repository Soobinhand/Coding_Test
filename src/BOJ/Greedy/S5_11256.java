package BOJ.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class S5_11256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i=0;i<testCase;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int answer = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j=0;j<b;j++){
                arr.add(sc.nextInt() * sc.nextInt());
            }
            arr.sort(Collections.reverseOrder());
            for (int j=0;j<b;j++){
                if (a <= 0){
                    break;
                }
                a -= arr.get(j);
                answer++;
            }
            System.out.println(answer);
        }
    }
}
