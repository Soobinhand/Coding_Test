package BOJ.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class G5_2493 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Top> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i<=n;i++){
            int height = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty()){
                if (stack.peek().height >= height){
                    System.out.print(stack.peek().num+" ");
                    break;
                }
                stack.pop();
            }
            if (stack.isEmpty()){
                System.out.print("0 ");
            }
            stack.push(new Top(i, height));
        }
    }
}

class Top{
    int num;
    int height;

    Top(int num, int height){
        this.num = num;
        this.height = height;
    }
}
