package BOJ.Back_Tracking;

import java.util.Arrays;
import java.util.Scanner;

public class S3_15656 {
    static int n;
    static int m;
    static int[] arr;
    static int[] answer;
    static StringBuilder sb =  new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        answer = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);
    }
    static void dfs(int depth){
        if (depth == m){
            for (int i=0;i<m;i++){
                sb.append(answer[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=0;i<n;i++){
            answer[depth] = arr[i];
            dfs(depth+1);
        }
    }
}