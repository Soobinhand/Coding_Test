package BOJ.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B1_9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            if (a == -1){
                break;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            int temp = 0;
            for (int i=1;i<a;i++){
                if (a%i == 0){
                    arrayList.add(i);
                    temp += i;
                }
            }
            if (a == temp){
                System.out.print(a+" = ");
                for (int i=0;i< arrayList.size();i++){
                    if (i == arrayList.size()-1){
                        System.out.print(arrayList.get(i));
                    }else {
                        System.out.print(arrayList.get(i) + " + ");
                    }
                }
                System.out.println();
            }else{
                System.out.println(a+" is NOT perfect.");
            }
        }
    }
}
