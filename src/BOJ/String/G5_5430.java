package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class G5_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        tc : for (int i=0;i<testCase;i++){
            String func = br.readLine();
            int arrSize = Integer.parseInt(br.readLine());
            String str = br.readLine().replace("[","")
                    .replace("]","")
                    .replace(","," ");
            Deque<Integer> deque = new LinkedList<>();
            StringTokenizer st1 = new StringTokenizer(str);
            for (int j=0;j<arrSize;j++){
                    deque.add(Integer.parseInt(st1.nextToken()));
            }
            boolean isReverse = false;
            for (char c : func.toCharArray()){
                if (c == 'R'){
                    isReverse = !isReverse;
                }else if (c=='D'){
                    if (deque.isEmpty()){
                        sb.append("error").append("\n");
                        continue tc;
                    }
                    if (isReverse){
                        deque.removeLast();
                    }else{
                        deque.removeFirst();
                    }
                }
            }
            sb.append("[");
            while (!deque.isEmpty()){
                if (isReverse){
                    if (arrSize==1){
                        sb.append(deque.removeLast());
                        continue;
                    }
                    sb.append(deque.removeLast()).append(",");
                }else{
                    sb.append(deque.removeFirst()).append(",");
                }
            }
            if (arrSize > 1){
                sb.deleteCharAt(sb.lastIndexOf(","));
            }
            sb.append("]").append("\n");
        }
        System.out.println(sb);
    }
}
