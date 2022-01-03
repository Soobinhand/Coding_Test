package BOJ.Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class S3_10974 {

    public static Scanner sc = new Scanner(System.in);

/////////////////////////////////////////
    /*
    문제의 답 구현
     */
/////////////////////////////////////////

    public static void main(String[] args) {
        int a = integer_scanner();
        int[] arr = new int[a+1];
        boolean[] visit = new boolean[a+1];

        for (int i=1;i<=a;i++){
            visit[i] = true;
            dfs(arr, visit, a, i, 1);
            visit[i] = false;
        }
    }
    public static void dfs(int[] arr, boolean[] visit, int n, int start, int depth){
        arr[depth] = start;
        if (depth == n){
            for (int i=1;i<=n;i++){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
            return;
        }
        for (int i=1;i<=n;i++){
            if (visit[i]){
                continue;
            }
            visit[i] = true;
            dfs(arr, visit, n, i, depth+1);
            visit[i] = false;
        }
    }

/////////////////////////////////////////
    /*
    문제의 답 구현
     */
/////////////////////////////////////////







/////////////////////////////////////////
/*
백준 문제 해결을 위한 기본적인 메소드 구현
 */
/////////////////////////////////////////

    // 정수 입력
    public static int integer_scanner(){
        return sc.nextInt();
    }

    // 정수 1차원 배열 입력
    public static int[] integer_arr_1_scanner(int size){
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // 정수 2차원 배열 입력 (행과 열 크기가 다를 때)
    public static int[][] integer_arr_2_scanner(int size_1, int size_2){
        int[][] arr_2 = new int[size_1][size_2];
        for (int i=0;i<size_1;i++){
            for (int j=0;j<size_2;j++){
                arr_2[i][j] = sc.nextInt();
            }
        }
        return arr_2;
    }

    // 정수 2차원 배열 입력 (행과 열 크기가 같을 때)
    public static int[][] integer_arr_2_scanner(int size){
        int[][] arr_2 = new int[size][size];
        for (int i=0;i<size;i++){
            for (int j = 0; j<size;j++){
                arr_2[i][j] = sc.nextInt();
            }
        }
        return arr_2;
    }
}

