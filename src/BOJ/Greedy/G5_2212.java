package BOJ.Greedy;

import java.util.*;

public class G5_2212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b >=a){
            System.out.println(0);
            return;
        }
        int sum = 0;
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] diff = new int[a-1];
        for (int i=0;i<a-1;i++){
            diff[i] = arr[i+1] - arr[i];
        }
        Arrays.sort(diff);
        for (int i=0;i<a-b;i++){
            sum += diff[i];
        }
        System.out.println(sum);

    }
}
