package BOJ.Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class S3_1874 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int[] answer = new int[a];
        int pq = 0;
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=0;i<a;i++){
            answer[i] = sc.nextInt();
        }
        for (int i=1;i<=a;i++){
            stack.push(i);
            arrayList.add("+");
            while (!stack.isEmpty()){
                if (stack.peek() == answer[pq]){
                    arrayList.add("-");
                    stack.pop();
                    pq++;
                }else{break;}
            }
        }
        if (!stack.isEmpty()){
            System.out.println("NO");
        }else{
            for (String i : arrayList){
                System.out.println(i);
            }
        }
    }
}
