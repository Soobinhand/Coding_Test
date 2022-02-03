package BOJ.Math;

import java.util.Scanner;

public class S3_1057{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int kim = sc.nextInt();
        int lim = sc.nextInt();
        int count = 0;
        while (kim != lim){
            kim = (kim/2 + kim%2);
            lim = (lim/2 + lim%2);
            count++;
        }
        System.out.println(count);
    }
}