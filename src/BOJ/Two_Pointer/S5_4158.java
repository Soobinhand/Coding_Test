package BOJ.Two_Pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S5_4158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) {
                System.out.println(sb);
                break;
            }
            int[] arr = new int[N];
            int[] brr = new int[M];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < N; i++) {
                brr[i] = Integer.parseInt(br.readLine());
            }
            int a = 0;
            int b = 0;
            int answer = 0;
            while (true) {
                if (a == N || b == M) {
                    break;
                }
                if (arr[a] == brr[b]) {
                    answer++;
                    a++;
                    b++;
                } else if (arr[a] < brr[b]) {
                    a++;
                } else if (arr[a] > brr[b]) {
                    b++;
                }
            }
            sb.append(answer).append(" ");
        }
    }
}
