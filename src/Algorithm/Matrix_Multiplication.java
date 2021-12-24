package Algorithm;

import java.util.Arrays;
/**
두 행렬의 곱을 구하는 솔루션.
 */
public class Matrix_Multiplication {

    public static int[][] matrix_multiplication(int[][] a, int[][] b){
        int[][] answer = new int[a.length][b.length];
        for (int i =0; i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for (int k=0;k<a.length;k++){
                    answer[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2},{3,4}};
        int[][] b = new int[][]{{1,2,3},{3,4,4}};
        System.out.println(Arrays.deepToString(matrix_multiplication(a, b)));
    }
}
