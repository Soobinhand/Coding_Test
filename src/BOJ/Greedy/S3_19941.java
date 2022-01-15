package BOJ.Greedy;

import java.util.Scanner;

public class S3_19941 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] arr;
        arr = sc.next().toCharArray();
        int answer = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == 'P'){
                int start = i-b;
                int end = i+b;
                if (start <= 0){
                    start = 0;
                }
                if (end >= a){
                    end = arr.length - 1;
                }
                for (int j = start;j<=end;j++){
                    if (arr[j] == 'H'){
                        answer++;
                        arr[j] = 'E';
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
