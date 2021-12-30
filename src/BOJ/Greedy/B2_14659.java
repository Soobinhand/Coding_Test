package BOJ.Greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class B2_14659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        int answer;
        int max = 0;
        for (int i=0;i<arr.length;i++){
            answer = 0;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]){
                    answer++;
                    max = Math.max(answer,max);
                }else{
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
