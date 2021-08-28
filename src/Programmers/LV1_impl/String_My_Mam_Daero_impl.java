package Programmers.LV1_impl;

import Programmers.LV1.String_My_Mam_Daero;

import java.util.Arrays;

public class String_My_Mam_Daero_impl {
    public static void main(String[] args) {
        String_My_Mam_Daero a = new String_My_Mam_Daero();
        String[] strings = {"sun","bed","car"};
        int n = 1;
        System.out.println(Arrays.toString(a.solution(strings, n)));
    }
}
