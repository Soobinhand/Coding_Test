package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1_11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i=0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            String str = "";
            int max = 0;
            for (int j=0;j<b;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()){
                    String temp = st.nextToken();
                    int tempp = Integer.parseInt(st.nextToken());
                    if (max < tempp){
                        max = tempp;
                        str = temp;
                    }
                }
            }
            System.out.println(str);
        }
    }
}
