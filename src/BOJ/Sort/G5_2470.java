package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G5_2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int answer1 = 0;
        int answer2 = 0;

        int lo = 0;
        int hi = arr.length-1;
        int sum;
        int tmp;
        while (lo < hi){
            sum = arr[lo] + arr[hi];
            tmp = Math.abs(sum);
            if (tmp < min){
                min = tmp;
                answer1 = arr[lo];
                answer2 = arr[hi];
            }
            if (sum > 0){
                hi--;
            }else{
                lo++;
            }
        }
        System.out.println(answer1+" "+answer2);

    }
}