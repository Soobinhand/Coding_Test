package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S5_1251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i=1;i<str.length()-1;i++){
            for (int j=i+1;j<str.length();j++){
                sb1.append(str, 0,i);
                sb2.append(str,i,j);
                sb3.append(str,j,str.length());
                sb1.reverse();
                sb2.reverse();
                sb3.reverse();
                StringBuilder total = new StringBuilder();
                total.append(sb1).append(sb2).append(sb3);
                list.add(total.toString());
                sb1.setLength(0);
                sb2.setLength(0);
                sb3.setLength(0);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
