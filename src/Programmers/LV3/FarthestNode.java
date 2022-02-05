package Programmers.LV3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FarthestNode {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public int solution(int n, int[][] edge) {
        int answer = 0;
        visited = new boolean[n + 1];
        for (int i=0;i<=n;i++){
            graph.add(i, new ArrayList<>());
        }
        for (int i=0;i<edge.length;i++){
            graph.get(edge[i][0]).add(edge[i][1]);
            graph.get(edge[i][1]).add(edge[i][0]);
        }
        return bfs();
    }
    public static int bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        int cnt = 0;
        while (true){
            Queue<Integer> temp = new LinkedList<>();
            while (!queue.isEmpty()){
                int parent = queue.poll();
                for (int adj : graph.get(parent)){
                    if (!visited[adj]){
                        temp.add(adj);
                        visited[adj] = true;
                    }
                }
            }
            if (temp.isEmpty()) break;
            queue.addAll(temp);
            cnt = temp.size();
        }
        return cnt;
    }
}