package BOJ.Math;


import java.util.Arrays;
import java.util.Scanner;



public class B4_2525 {

    public static Scanner sc = new Scanner(System.in);

/////////////////////////////////////////
    /*
    문제의 답 구현
     */
/////////////////////////////////////////

    public static void main(String[] args) {
        int a = integer_scanner();
        int b = integer_scanner();
        int c = integer_scanner();
        if (b+c < 60){
            System.out.println(a+" "+(b+c));
        }else{
            a += (b+c)/60;
            b = (b+c)%60;
            if (a>=24) a -=24;
            System.out.println(a+" "+(b));
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
