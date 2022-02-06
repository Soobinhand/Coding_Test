package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class G5_23559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[][] arr = new int[N][3];
        for (int i=0;i<N;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = arr[i][0] - arr[i][1];
            X-=1000;
            answer += arr[i][1];
        }
        Arrays.sort(arr, ((o1, o2) -> (o2[2] - o1[2])));
        for (int i=0;i<N;i++){
            if (X >= 4000 && arr[i][0] - arr[i][1] >= 0){
                X -=4000;
                answer += arr[i][0] - arr[i][1];
            }
        }
        System.out.println(answer);
    }
}
