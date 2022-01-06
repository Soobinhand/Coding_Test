package BOJ.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i=0;i<a;i++){
            Stack<String> stack = new Stack<>();
            String message = br.readLine();
            String[] mess = message.split(" ");
            for (String j : mess){
                stack.push(j);
            }
            System.out.print("Case #"+(i+1)+": ");
            for (int ii=0;ii< stack.capacity()-1;ii++){
                if (!stack.isEmpty()){
                    System.out.print(stack.pop()+" ");
                }
            }
            System.out.println();
        }
    }
}
