package Programmers.LV2_impl;

import Programmers.LV2.H_index;

public class H_index_impl {
    public static void main(String[] args) {
        H_index h_index = new H_index();
        int[] citations = {3,0,1,6,5};
        System.out.println(h_index.solution(citations));
    }
}
