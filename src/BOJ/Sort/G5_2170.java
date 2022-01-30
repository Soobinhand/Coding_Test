package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G5_2170{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[][] arr = new int[a][2];
        for (int i=0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, ((o1, o2) -> {
            if (o1[0] == o2[0]){
                return Integer.compare(o1[1],o2[1]);
            }else{
                return Integer.compare(o1[0], o2[0]);
            }
        }));
        int min = arr[0][0];
        int max = arr[0][1];
        int len = max-min;
        for (int i=1;i<a;i++){
            if (min <= arr[i][0] && arr[i][1] <= max){
                continue;
            }else if(arr[i][0] < max){
                len += arr[i][1] - max;
            }else{
                len += arr[i][1] - arr[i][0];
            }
            min = arr[i][0];
            max = arr[i][1];
        }
        System.out.println(len);
    }
}
