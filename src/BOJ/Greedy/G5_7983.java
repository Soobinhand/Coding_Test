package BOJ.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class G5_7983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr= new int[a][2];
        for (int i=0;i<a;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr, ((o1, o2) -> Integer.compare(o2[1], o1[1])));
        int max = arr[0][1];
        for (int i=0;i<a;i++){
            if (arr[i][1] > max){
                max -= arr[i][0];
            }else if (arr[i][1] == max){
                max -= arr[i][0];
            }else if (arr[i][1] < max){
                max = arr[i][1];
                max -= arr[i][0];
            }
        }
        System.out.println(max);
    }
}
