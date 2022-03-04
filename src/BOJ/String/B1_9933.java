package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1_9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i=0;i<a;i++){
            arrayList.add(br.readLine());
        }
        for (int i=0;i<a;i++){
            StringBuilder sb = new StringBuilder(arrayList.get(i));
            if (arrayList.contains(sb.reverse().toString())){
                System.out.print(sb.length()+" "+sb.toString().charAt(sb.length()/2));
                System.exit(0);
            }
        }
    }
}
