package Programmers.LV3;

import java.util.*;

public class TravelRoute {
    boolean[] visited;
    ArrayList<String> allRoute;
    int count;
    public String[] solution(String[][] tickets) {
        count = 0;
        visited = new boolean[tickets.length];
        allRoute = new ArrayList<>();
        dfs("ICN", "ICN", tickets, count);
        String[] answer = {};
        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");
        return answer;
    }

    public void dfs(String start, String route, String[][] tickets, int count){
        if (count == tickets.length){
            allRoute.add(route);
            return;
        }
        for (int i=0;i< tickets.length;i++){
            if (start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], route+" "+tickets[i][1], tickets, count+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        TravelRoute solution = new TravelRoute();
        String[][] str = new String[][]{
                {"ICN", "SFO"},
                {"ICN", "ATL"},
                {"SFO", "ATL"},
                {"ATL", "ICN"},
                {"ATL", "SFO"}
        };
        System.out.println(Arrays.toString(solution.solution(str)));
    }
}
