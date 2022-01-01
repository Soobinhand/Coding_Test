package BOJ.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class S4_1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int lo = 0;
        int hi = a-1;
        int answer = 0;
        while(lo<hi){
            if (arr[lo]+arr[hi] == b){
                answer++;
                lo++;
                hi--;
            }else if(arr[lo]+arr[hi] > b){
                hi--;
            }else if(arr[lo]+arr[hi] < b){
                lo++;
            }
        }
        System.out.println(answer);
    }
}
