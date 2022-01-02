package BOJ.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1_2161 {

    public static Scanner sc = new Scanner(System.in);

/////////////////////////////////////////
    /*
    문제의 답 구현
     */
/////////////////////////////////////////

    public static void main(String[] args) {
        int a = integer_scanner();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new LinkedList<>();
        for (int i=1;i<=a;i++){
            queue.add(i);
        }
        for (int i=1;i<=a;i++){
            queue1.add(queue.poll());
            queue.add(queue.poll());
        }
        for (int i:queue1){
            System.out.print(i+" ");
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
