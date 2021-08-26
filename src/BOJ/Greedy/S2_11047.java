package BOJ.Greedy;

import java.util.Scanner;

public class S2_11047 {
    public void coin(int price, int[] list){
        int total = 0;
        int coinNum = 0;
        for(int i=list.length-1;i>=0;i--){
            coinNum = price / list[i];
            total += coinNum;
            price -= coinNum*list[i];
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] c = new int[a];
        for(int i=0;i<a;i++){
            c[i] = sc.nextInt();
        }
        S2_11047 coin = new S2_11047();
        coin.coin(b,c);

    }
}
