package BOJ.Back_Tracking;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class S2_15664 {
    static int n;
    static int m;
    static int[] arr;
    static int[] temp;
    static boolean[] visit;
    static LinkedHashSet<String> set;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        temp = new int[m];
        visit = new boolean[n];
        set = new LinkedHashSet<>();
        for (int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0,0);
        for (String val : set){
            System.out.println(val);
        }
    }
    static void dfs(int depth, int start){
        if (depth == m){
            StringBuilder sb = new StringBuilder();
            for (int temps : temp){
                sb.append(temps).append(' ');
            }
            set.add(sb.toString());
            return;
        }
        for (int i=start; i < n;i++){
            if (!visit[i]){
                visit[i] = true;
                temp[depth] = arr[i];
                dfs(depth + 1, i);
                visit[i] = false;
            }
        }
    }
}
