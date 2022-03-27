package BOJ.Combination;

import java.util.Scanner;

public class S3_6591 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (n == 0 && k == 0){
                break;
            }
            long answer = 1;
            if (k > n-k) k = n - k;
            for (long i = 1; i <= k;i++){
                answer *= n--;
                answer /= i;
            }
            System.out.println(answer);
        }
    }

}
