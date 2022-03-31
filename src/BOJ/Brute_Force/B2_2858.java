package BOJ.Brute_Force;

import java.util.Scanner;

public class B2_2858 {

    static int R;
    static int B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        B = sc.nextInt();
        for (int i = 1; i< R;i++){
            for (int j=1;j < R;j++){
                if (i*2 + (j-2)*2 == R && (i-2)*(j-2) == B){
                    System.out.println(j +" "+i);
                    return;
                }
            }
        }
    }
}
