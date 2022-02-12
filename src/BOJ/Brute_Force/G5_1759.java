package BOJ.Brute_Force;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class G5_1759 {
    static int a;
    static int b;
    static boolean[] visit;
    static ArrayList<String> arrayList;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        arrayList =  new ArrayList<>();
        for (int i=0;i<b;i++){
            arrayList.add(sc.next());
        }
        Collections.sort(arrayList);
        visit = new boolean[b];
        combination(0,0);
    }

    static void combination(int start, int depth){
        if (depth == a){
            int v = 0;
            int cc = 0;
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<b;i++){
                if (visit[i]){
                    sb.append(arrayList.get(i));
                    if (Objects.equals(arrayList.get(i), "a")
                    ||  Objects.equals(arrayList.get(i), "e")
                    ||  Objects.equals(arrayList.get(i), "i")
                    ||  Objects.equals(arrayList.get(i), "o")
                    ||  Objects.equals(arrayList.get(i), "u")){
                        v++;
                    }else{
                        cc++;
                    }
                }
            }
            if (v >= 1 && cc >= 2){
                System.out.println(sb);
            }
        }
        for (int i=start;i<b;i++){
            visit[i] = true;
            combination(i+1, depth+1);
            visit[i] = false;
        }
    }


}
