package BOJ.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S3_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0;i<a;i++){
            hashSet1.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i=0;i<b;i++){
            hashSet2.add(Integer.parseInt(st.nextToken()));
        }
        int result = 0;
        for (int num : hashSet1){
            if (!hashSet2.contains(num)){
                result++;
            }
        }
        for (int num : hashSet2){
            if (!hashSet1.contains(num)){
                result++;
            }
        }
        System.out.println(result);
    }
}
