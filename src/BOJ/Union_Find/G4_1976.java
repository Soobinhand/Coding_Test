package BOJ.Union_Find;

import java.util.Scanner;

public class G4_1976 {

    private static int[] parent;
    private static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][a];
        int[] path = new int[b];
        parent = new int[a];
        for (int i=0;i<a;i++){
            parent[i] = i;
        }
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1){
                    union(i,j);
                }
            }
        }
        for (int i=0;i<b;i++){
            path[i] = sc.nextInt()-1;
        }
        for (int i=0;i<b-1;i++){
            if (!connected(path[i], path[i+1])){
                count++;
            }
        }
        if (count == 0) System.out.println("YES");
        else System.out.println("NO");
    }

    public static int find(int p){
        while(p != parent[p]){
            p = parent[p];
        }
        return p;
    }

    public static void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if (i < j) parent[j] = i;
        else parent[i] = j;
    }

    public static boolean connected(int p, int q){
        return find(p) == find(q);
    }
}
