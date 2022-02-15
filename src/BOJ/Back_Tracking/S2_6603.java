package BOJ.Back_Tracking;

import java.util.Scanner;

public class S2_6603 {
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            if (a == 0){
                break;
            }
            int[] arr = new int[a];
            visit = new boolean[a];
            for (int i=0;i<a;i++){
                arr[i] = sc.nextInt();
            }
            dfs(arr, 0, 0, a);
            System.out.println();
        }
    }
    static void dfs(int[] arr, int start, int depth, int a){
        if (depth == 6){
            for (int i=0;i<a;i++){
                if (visit[i]){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
        for (int i = start; i< a;i++){
            visit[i] = true;
            dfs(arr, i+1, depth+1, a);
            visit[i] = false;
        }
    }
}