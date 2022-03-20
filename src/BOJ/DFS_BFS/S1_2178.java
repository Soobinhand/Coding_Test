package BOJ.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S1_2178 {

    static int N;
    static int M;
    static int[][] miro;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        miro = new int[N][M];
        for (int i=0;i<N;i++){
            String str = br.readLine();
            for (int j=0;j<M;j++){
                miro[i][j] = str.charAt(j) - '0';
            }
        }
        visited = new boolean[N][M];
        visited[0][0] = true;
        bfs(0,0);
        System.out.println(miro[N-1][M-1]);
    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});

        // 큐가 끝날 때까지
        while (!queue.isEmpty()){
            int[] now = queue.poll();
            // 현재 좌표
            int nowX = now[0];
            int nowY = now[1];

            // 동서남북 확인 차 4번을 돔
            for (int i=0;i<4;i++){
                // 다음 방문할 좌표
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                // 다음 좌표가 범위를 넘어가면 건너뜀
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M){
                    continue;
                }

                // 이미 방문했거나 갈 수 없는 곳이면 건너뜀
                if (visited[nextX][nextY] || miro[nextX][nextY] == 0){
                    continue;
                }

                // 다음 방문할 좌표를 큐에 넣음
                queue.add(new int[]{nextX, nextY});
                // 배열 안에 다음 방문할 곳은 1 더 커야함
                miro[nextX][nextY] = miro[nowX][nowY] + 1;
                // 다음 좌표는 true
                visited[nextX][nextY] = true;
            }
        }
    }
}
