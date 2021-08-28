package Programmers.LV1_impl;

import Programmers.LV1.Calculate_Insufficient_Amount;

public class Calculate_Insufficient_Amount_impl {
    public static void main(String[] args) {
        Calculate_Insufficient_Amount a = new Calculate_Insufficient_Amount();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(a.solution(price,money,count));
    }
}
