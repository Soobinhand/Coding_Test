package BOJ.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class S3_12018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 과목 수
        int m = sc.nextInt(); // 마일리지
        int[] temp = new int[n];
        int answer = 0;
        for (int i=0;i<n;i++){
            int lecture = sc.nextInt();
            int person = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j=0;j<lecture;j++){
                arr.add(sc.nextInt());
            }
            arr.sort(Collections.reverseOrder());
            if (lecture >= person){
                temp[i] = arr.get(person - 1);
                if (temp[i] > 36){
                    temp[i] = 36;
                }
            }else{
                temp[i] = 1;
            }
        }
        Arrays.sort(temp);
        for (int i=0;i<n;i++){
            m -= temp[i];
            if (m < 0){
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
}