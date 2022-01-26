package BOJ.Math;

import java.math.BigInteger;
import java.util.Scanner;

public class S3_2407 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        BigInteger mom = BigInteger.ONE;
        BigInteger son = BigInteger.ONE;
        for (long i=a;i>a-b;i--){
            mom = mom.multiply(BigInteger.valueOf(i));
        }
        for (long i=b;i>0;i--){
            son = son.multiply(BigInteger.valueOf(i));
        }
        BigInteger answer = mom.divide(son);
        System.out.println(answer);
    }
}
