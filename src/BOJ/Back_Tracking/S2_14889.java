package BOJ.Back_Tracking;

import java.util.Scanner;

public class S2_14889 {
    static int a;
    static int team;
    static int[][] arr;
    static boolean[] visit;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        team = a/2;
        arr = new int[a][a];
        visit = new boolean[a];
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        backTracking(0, 0);
        System.out.println(min);
    }
    static void backTracking(int index, int depth){
        if (depth == team){
            diff();
            return;
        }
        for (int i = index; i<a;i++){
            if (!visit[i]){
                visit[i] = true;
                backTracking(i+1, depth+1);
                visit[i] = false;
            }
        }
    }

    static void diff(){
        int team_start = 0;
        int team_link = 0;

        for (int i=0;i<a-1;i++){
            for (int j=i+1;j<a;j++){
                if (visit[i] && visit[j]){
                    team_start += arr[i][j];
                    team_start += arr[j][i];
                }
                else if (!visit[i] && !visit[j]){
                    team_link += arr[i][j];
                    team_link += arr[j][i];
                }
            }
        }

        int val = Math.abs(team_start - team_link);
        if (val == 0){
            System.out.println(val);
            System.exit(0);
        }
        min = Math.min(val, min);
    }
}