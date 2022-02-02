package BOJ.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S4_1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Map<String , Integer> map = new HashMap<>();
        String[] arr = new String[a];
        for (int i=0;i<a;i++){
            String s = sc.next();
            arr[i] = s;
            map.put(s, i+1);
        }
        for (int i=0;i<b;i++){
            if (sc.hasNextInt()){
                System.out.println(arr[sc.nextInt() - 1]);
            }else{
                System.out.println(map.get(sc.next()));
            }
        }
    }
}