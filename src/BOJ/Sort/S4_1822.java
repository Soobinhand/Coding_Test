package BOJ.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class S4_1822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0;i<a;i++){
            treeSet.add(sc.nextInt());
        }
        for (int i=0;i<b;i++){
            int n = sc.nextInt();
            treeSet.remove(n);
        }
        if (!treeSet.isEmpty()){
            System.out.println(treeSet.size());
            for (int i : treeSet){
                System.out.print(i+" ");
            }
        }else{
            System.out.println(0);
        }
    }
}
