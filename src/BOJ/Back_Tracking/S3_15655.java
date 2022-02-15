package BOJ.Back_Tracking;

import java.util.Arrays;
import java.util.Scanner;

public class S3_15655 {
    static int n;
    static int m;
    static int[] arr;
    static int[] answer;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        answer = new int[n];
        visit = new boolean[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0,0);
    }
    static void dfs(int depth, int a){
        if (depth == m){
            for (int i=0;i<m;i++){
                System.out.print(answer[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i=a;i<n;i++){
            if (!visit[i]){
                visit[i] = true;
                answer[depth] = arr[i];
                dfs(depth+1, i+1);
                visit[i] = false;
            }
        }
    }
}