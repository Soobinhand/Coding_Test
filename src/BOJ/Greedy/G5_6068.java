package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class G5_6068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][2];
        for (int i=0;i<arr.length;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[i][0] = end;
            arr[i][1] = start;
        }
        Arrays.sort(arr, ((o1, o2) -> {
            if (o1[0] == o2[0]){
                return Integer.compare(o2[1], o1[1]);
            }else{
                return Integer.compare(o2[0], o1[0]);
            }
        }));
        int max = arr[0][0];
        for (int i=0;i<arr.length;i++){
            if (arr[i][0] == max){
                max -= arr[i][1];
            }else if (arr[i][0] > max){
                max -= arr[i][1];
            }else{
                max = arr[i][0];
                max -= arr[i][1];
            }
        }
        if (max >= 0){
            System.out.println(max);
        }else{
            System.out.println(-1);
        }
    }
}
