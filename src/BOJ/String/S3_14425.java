package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S3_14425{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        for (int i=0;i<a;i++){
            set.add(br.readLine());
        }
        int count = 0;
        for (int i=0;i<b;i++){
            String str = br.readLine();
            if (set.contains(str)){
                count++;
            }
        }
        System.out.println(count);
    }
}
