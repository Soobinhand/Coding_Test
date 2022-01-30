package BOJ.DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class S2_2644 {

    private static int V;
    private static ArrayList<ArrayList<Integer>> arr;
    private static boolean visit[];
    private static int answer = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        arr = new ArrayList<>();
        visit = new boolean[V+1];
        for (int i=0;i<=V;i++){
            arr.add(new ArrayList<>());
        }
        int joka1 = sc.nextInt();
        int joka2 = sc.nextInt();
        int a = sc.nextInt();
        for (int i=0;i<a;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            arr.get(p).add(q);
            arr.get(q).add(p);
        }
        dfs(joka1, joka2, 0);
        System.out.println(answer);
    }

    public static void dfs(int start, int end, int cnt){
        if (start == end){
            answer = cnt;
            return;
        }
        visit[start] = true;
        for (int i=0;i<arr.get(start).size();i++){
            int next = arr.get(start).get(i);
            if (!visit[next]){
                dfs(next, end, cnt+1);
            }
        }
    }
}
