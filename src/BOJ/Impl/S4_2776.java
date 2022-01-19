package BOJ.Impl;

import java.io.*;
import java.util.*;

public class S4_2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        for (int j=0;j<testCase;j++) {
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Set<Integer> aset = new HashSet<>();
            for (int i=0;i<a;i++){
                aset.add(Integer.parseInt(st.nextToken()));
            }
            int b = Integer.parseInt(br.readLine());
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int i=0;i<b;i++){
                if (aset.contains(Integer.parseInt(st1.nextToken()))){
                    bw.write(String.valueOf(1)+"\n");
                }else{
                    bw.write(String.valueOf(0)+"\n");
                }
            }
            bw.flush();
        }
        bw.close();
    }
}
