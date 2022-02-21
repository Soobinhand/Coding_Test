package BOJ.Back_Tracking;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class S2_15665 {
    static int n;
    static int m;
    static int[] arr;
    static int[] arr1;
    static boolean[] visit;
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        visit = new boolean[n];
        arr1 = new int[m];
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0);
        set.forEach(System.out::println);
    }

    static void dfs(int depth){
        if (depth == m){
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<m;i++){
                sb.append(arr1[i]).append(" ");
            }
            set.add(sb.toString());
            return;
        }
        for (int i=0;i<n;i++){
            arr1[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}