package BOJ.Impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B2_3047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', arr[0]);
        map.put('B', arr[1]);
        map.put('C', arr[2]);
        String str = sc.next();
        for (int i=0;i<str.length();i++){
            System.out.print(map.get(str.charAt(i))+" ");
        }
    }
}
