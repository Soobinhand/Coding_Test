package BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class S3_1448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<a;i++){
            arrayList.add(Integer.parseInt(br.readLine()));
        }
        int max = 0;
        arrayList.sort(Collections.reverseOrder());
        for (int i=0;i<a-2;i++){
            if (arrayList.get(i) < arrayList.get(i+1) + arrayList.get(i+2)){
                max = Math.max(max, arrayList.get(i) + arrayList.get(i+1) + arrayList.get(i+2));
            }
        }
        if (max == 0){
            max = -1;
        }
        System.out.println(max);
    }
}
