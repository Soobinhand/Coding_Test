package BOJ.Back_Tracking;

import java.util.*;

public class S2_15663 {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visit;
    static int[] temp;
    static LinkedHashSet<String> set = new LinkedHashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        visit = new boolean[n];
        temp = new int[m];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0);
        for (String val : set){
            System.out.println(val);
        }
    }

    static void dfs(int depth){
        if (depth == m){
            StringBuilder sb = new StringBuilder();
            for (int temps : temp){
                sb.append(temps).append(' ');
            }
            set.add(sb.toString());
            return;
        }
        for (int i=0;i<n;i++){
            if (!visit[i]){
                visit[i] = true;
                temp[depth] = arr[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
