package BOJ.Stack;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class G4_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 4
        int[] A = new int[n]; // 들어오는 값들 3 5 2 7
        int[] answer = new int[n];
        String[] strings = br.readLine().split(" "); // 3 5 2 7
        for (int i = 0; i < n; i++){
            A[i] = Integer.parseInt(strings[i]); // 3 5 2 7
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1;i <n;i++){
            while (!stack.isEmpty() && A[stack.peek()] < A[i]){
                answer[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0;i<n;i++){
            bw.write(answer[i] + " ");
        }
        bw.flush();
    }
}
