package BOJ.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class G5_1068 {
    public static int V, root;
    public static ArrayList<ArrayList<Integer>> arr;
    static int answer, delete;
    static boolean visited[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        arr= new ArrayList<>();
        visited = new boolean[V];
        for (int i=0;i<V;i++){
            arr.add(new ArrayList<>());
        }
        for (int i=0;i<V;i++){
            int b = sc.nextInt();
            if (b == -1){
                root = i;
                continue;
            }
            arr.get(b).add(i);
        }
        delete = sc.nextInt();
        if (delete == root) System.out.println(0);
        else{
            dfs(root);
            System.out.println(answer);
        }
    }

    static void dfs(int node){
        visited[node] = true;
        int child = 0;
        for (int i=0;i<arr.get(node).size();i++){
            if (!visited[arr.get(node).get(i)] && arr.get(node).get(i) != delete){
                child++;
                dfs(arr.get(node).get(i));
            }
        }
        if (child == 0){
            answer++;
        }
    }
}
