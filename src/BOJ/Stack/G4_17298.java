package BOJ.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class G4_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[testCase];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0;i<testCase;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0;i<testCase;i++){
            while (!stack.empty() && arr[stack.peek()] < arr[i]){
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
    }
}
