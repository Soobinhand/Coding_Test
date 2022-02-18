package BOJ.Back_Tracking;

import java.util.Scanner;

public class S3_16922 {
    static int n;
    static int[] arr = {1,5,10,50};
    static boolean[] visit;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visit = new boolean[5000];
        dfs(0,0,0);
        System.out.println(cnt);
    }

    static void dfs(int depth, int start, int sum){
        if (depth == n){
            if (!visit[sum]){
                visit[sum] = true;
                cnt++;
            }
            return;
        }
        for (int i=start;i<4;i++){
            dfs(depth+1, i, sum + arr[i]);
        }
    }
}
