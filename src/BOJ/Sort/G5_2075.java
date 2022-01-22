package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G5_2075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringTokenizer st;
        for (int i=0;i<a;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }
        }
        arrayList.sort(Collections.reverseOrder());
        System.out.println(arrayList.get(a-1));
    }
}
