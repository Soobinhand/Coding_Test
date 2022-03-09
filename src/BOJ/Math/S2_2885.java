package BOJ.Math;

import java.util.Scanner;

public class S2_2885 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int chocolate = 1;
        int answer = 0;
        while (chocolate < k){
            chocolate *= 2;
        }
        int a = chocolate;
        while (k > 0){
            if (k >= chocolate){
                k -= chocolate;
            }else{
                chocolate /=2;
                answer++;
            }
        }
        System.out.print(a+" ");
        System.out.print(answer);
    }
}
