package BOJ.Impl;

import java.util.Scanner;

public class B3_10214 {
    static int yonsei;
    static int korea;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i=0;i<testCase;i++){
            yonsei = 0;
            korea = 0;
            for (int j=0;j<9;j++){
                yonsei += sc.nextInt();
                korea += sc.nextInt();
            }
            compareSchool(yonsei, korea);
        }
    }
    public static void compareSchool(int yonsei, int korea){
        if (yonsei > korea){
            System.out.println("Yonsei");
        }else if (yonsei < korea){
            System.out.println("Korea");
        }else{
            System.out.println("Draw");
        }
    }
}


