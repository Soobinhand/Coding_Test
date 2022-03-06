package BOJ.Impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] pro = new int[30];
        for (int i=0;i<a;i++){
            String player = br.readLine();
            pro[player.charAt(0) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<pro.length;i++){
            if (pro[i] >= 5){
                int temp = i + 'a';
                sb.append((char)temp);
            }
        }
        if (sb.length() == 0){
            System.out.println("PREDAJA");
        }else {
            System.out.println(sb);
        }
    }
}