package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class S4_14469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][3];
        for (int i=0;i<a;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = arr[i][0] + arr[i][1];
        }
        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]){
                return o1[1] - o2[1];
            }else {
                return o1[0] - o2[0];
            }
        });
        int answer = arr[0][2];
        for (int i=1;i<a;i++){
            if (arr[i][0] < answer){
                answer = arr[i][2] + answer - arr[i][0];
            }else{
                answer = arr[i][0] + arr[i][1];
            }
        }
        System.out.println(answer);
    }
}
