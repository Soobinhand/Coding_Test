package BOJ.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S3_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        for (int i=0;i<a;i++){
            Map<String, Integer> map = new HashMap<>();
            int b = Integer.parseInt(br.readLine());
            for (int j=0;j<b;j++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                if (map.containsKey(key)){
                    map.put(key, map.get(key) + 1);
                }else{
                    map.put(key, 1);
                }
            }
            int x = 1;
            for (int val : map.values()){
                x *= (val+1);
            }
            System.out.println(x - 1);
        }
    }
}
