package BOJ.Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class B2_2605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<a;i++){
            int num = sc.nextInt();
            if (num == 0){
                list.add(i+1);
            }else{
                list.add(list.size() - num, i + 1);
            }
        }
        for (int i : list){
            System.out.print(i+" ");
        }
    }
}
