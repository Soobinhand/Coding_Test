package BOJ.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S3_20291{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        SortedMap<String, Integer> stringIntegerSortedMap = new TreeMap<>();
        for (int i=0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(),".");
            st.nextToken();
            String key = st.nextToken();
            if (stringIntegerSortedMap.get(key) == null){
                stringIntegerSortedMap.put(key, 1);
            }else{
                stringIntegerSortedMap.put(key, stringIntegerSortedMap.get(key) + 1);
            }
        }
        for(String key : stringIntegerSortedMap.keySet()){
            System.out.println(key+" "+stringIntegerSortedMap.get(key));
        }
    }
}