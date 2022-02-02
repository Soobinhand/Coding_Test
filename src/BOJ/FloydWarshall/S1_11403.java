package BOJ.FloydWarshall;

import java.util.Scanner;

public class S1_11403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] map = new int[a][a];
        for(int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                map[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                for (int k=0;k<a;k++){
                    if (map[j][i] == 1 && map[i][k] == 1){
                        map[j][k] = 1;
                    }
                }
            }
        }
        for (int i=0;i<a;i++){
            for (int j=0;j<a;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}
