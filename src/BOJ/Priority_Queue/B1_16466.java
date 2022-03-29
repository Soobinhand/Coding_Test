package BOJ.Priority_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1_16466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        Arrays.sort(arr);
        for (int i=0;i<a;i++){
            if (arr[i] != i+1){
                System.out.println(i+1);
                answer++;
                break;
            }
        }
        if (answer==0){
            System.out.println(a+1);
        }
    }
}
