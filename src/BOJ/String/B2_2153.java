package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int number = 0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                number += (int)str.charAt(i) - 38;
            }else{
                number += (int)str.charAt(i) - 96;
            }
        }
        if (isPrime(number)){
            System.out.println("It is a prime word.");
        }else{
            System.out.println("It is not a prime word.");
        }
    }

    static boolean isPrime(int number){
        int prime = 0;
        if (number == 1){
            return true;
        }
        for (int i = 2;i<=number;i++){
            if (number % i == 0){
                prime++;
            }
        }
        return prime == 1;
    }
}
