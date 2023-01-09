package BOJ.Two_Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class G4_1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        int[] arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++){
            int a = 0;
            int b = N - 1;
            while (a < b){
                if (arr[a] + arr[b] == arr[i]){
                    if (a != i && b != i){
                        answer++;
                        break;
                    }else if(a == i){
                        a++;
                    }else {
                        b--;
                    }
                }else if(arr[a] + arr[b] < arr[i]){
                    a++;
                }else{
                    b--;
                }
            }
        }
        System.out.println(answer);
    }

}
