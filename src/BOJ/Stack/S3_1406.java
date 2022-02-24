package BOJ.Stack;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.StringTokenizer;

public class S3_1406 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String q = br.readLine();
        LinkedList<Character> list = new LinkedList<>();
        for (int i=0;i<q.length();i++){
            list.add(q.charAt(i));
        }
        int n = Integer.parseInt(br.readLine());
        ListIterator<Character> iterator = list.listIterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        for (int i = 0; i<n;i++){
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c){
                case 'L':
                    if (iterator.hasPrevious()){
                        iterator.previous();
                    }
                    break;
                case 'D':
                    if (iterator.hasNext()){
                        iterator.next();
                    }
                    break;
                case 'B':
                    if (iterator.hasPrevious()){
                        iterator.previous();
                        iterator.remove();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    iterator.add(t);
                    break;
                default:
                    break;
            }
        }
        for (Character c : list){
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
