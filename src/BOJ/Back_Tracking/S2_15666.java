package BOJ.Back_Tracking;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class S2_15666 {
    static int n;
    static int m;
    static int[] arr;
    static int[] answer;
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        answer = new int[m];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0,0);
        set.forEach(System.out::println);
    }
    static void dfs(int depth, int start){
        if (depth == m){
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<m;i++){
                sb.append(answer[i]).append(" ");
            }
            set.add(sb.toString());
            return;
        }
        for (int i = start;i<n;i++){
            answer[depth] = arr[i];
            dfs(depth + 1, i);
        }
    }
}
