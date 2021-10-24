package Programmers.LV2;

public class eat_land {
    public static void main(String[] args) {
        int[][] land = new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(solution(land));
    }
    public static int solution(int[][] land) {
        int answer = 0;

        for (int i=0;i<land[0].length;i++){

            answer = Math.max(land[0][i],0);
        }


        return answer;
    }
}
