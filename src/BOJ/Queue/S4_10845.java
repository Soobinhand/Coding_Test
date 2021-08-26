package BOJ.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class S4_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        List<Integer> que =new ArrayList<>();
        while(n-->0) {
            StringTokenizer st= new StringTokenizer(br.readLine());
            String temp =st.nextToken();
            switch(temp) {
                case "push":
                    que.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(!que.isEmpty()) {
                        System.out.println(que.get(0));
                        que.remove(0);
                    }
                    else {System.out.println(-1);}
                    break;
                case "size":
                    System.out.println(que.size());
                    break;
                case "empty":
                    if(que.isEmpty()) {System.out.println(1);}
                    else {System.out.println(0);}
                    break;
                case "front":
                    if(que.isEmpty()) {System.out.println(-1);}
                    else {
                        System.out.println(que.get(0));}
                    break;
                case "back":
                    if(que.isEmpty()) {System.out.println(-1);}
                    else {
                        System.out.println(que.get(que.size()-1));
                    }
            }
        }


    }
}


