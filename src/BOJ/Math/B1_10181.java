package BOJ.Math;

import java.util.ArrayList;
import java.util.Scanner;

public class B1_10181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            if (a == -1){
                break;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i=1;i<a;i++){
                if (a % i == 0){
                    arrayList.add(i);
                }
            }
            int sum = 0;
            for (int i : arrayList){
                sum += i;
            }
            System.out.print(a);
            if (sum == a){
                System.out.print(" = ");
                for (int i=0;i<arrayList.size();i++){
                    if (i == arrayList.size()-1){
                        System.out.print(arrayList.get(i));
                    }else {
                        System.out.print(arrayList.get(i) + " + ");
                    }
                }
            }else{
                System.out.print(" is NOT perfect.");
            }
            System.out.println();
        }
    }
}
