package BOJ.Back_Tracking;

import java.util.Arrays;
import java.util.Scanner;

public class S3_15654 {
    static int[] arr;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        arr = new int[a];
        visit = new boolean[a];
        int[] answer = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(a,b,0,answer);
    }

    static void dfs(int a, int b, int depth, int[] answer){
        if (depth == b){
            for (int i=0;i<b;i++){
                System.out.print(answer[i] +" ");
            }
            System.out.println();
            return;
        }
        for (int i = 0;i<a;i++){
            if (!visit[i]){
                visit[i] = true;
                answer[depth] = arr[i];
                dfs(a,b,depth+1, answer);
                visit[i] = false;
            }
        }
    }
}
