package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_10769 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = br.readLine();
        int happy = 0;
        int sad = 0;
        for (int i=0;i< answer.length();i++){
            if (answer.charAt(i) == ':' && answer.charAt(i+1) == '-' &&answer.charAt(i+2) == '('){
                sad++;
            }else if (answer.charAt(i) == ':' && answer.charAt(i+1) == '-' &&answer.charAt(i+2) == ')'){
                happy++;
            }
        }
        if (sad == 0 && happy == 0){
            System.out.println("none");
        }else if (sad > happy){
            System.out.println("sad");
        }else if (sad < happy){
            System.out.println("happy");
        }else {
            System.out.println("unsure");
        }
    }
}
