package BOJ.Brute_Force;

import java.util.Scanner;

public class S5_1018 {

    static int n;
    static int m;
    static int[][] board;
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];
        for (int i=0;i<n;i++){
            String s = sc.next();
            for (int j=0;j<m;j++){
                if (s.charAt(j) == 'W'){
                    board[i][j] = 1;
                }else{
                    board[i][j] = 0;
                }
            }
        }

        for (int i=0;i<n-7;i++){
            for (int j=0;j<m-7;j++){
                search(i,j);
            }
        }
        System.out.println(result);


    }

    public static void search(int x, int y){
        int a = x + 8;
        int b = y + 8;

        int color = board[x][y];

        int cnt = 0;

        for (int i=x;i<a;i++){
            for (int j = y;j<b;j++){
                if (board[i][j]!=color){
                    cnt++;
                }
                if(color == 0){
                    color = 1;
                }else if(color == 1){
                    color = 0;
                }
            }
        }
        cnt = Math.min(cnt, 64-cnt);
        result = Math.min(result,cnt);
    }
}
