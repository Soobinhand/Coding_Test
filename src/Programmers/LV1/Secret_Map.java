package Programmers.LV1;

import java.util.*;

public class Secret_Map {
    public static void main(String[] args) throws Exception {
        Secret_Map m= new Secret_Map();
        int[] arr1 = new int[]{9,20,28,18,11};
        int[] arr2 = new int[]{30,1,21,17,28};
        System.out.println(Arrays.toString(m.solution(5, arr1, arr2)));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i=0;i<n;i++){
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
            temp = String.format("%"+n+"s",temp);
            temp = temp.replaceAll("1","#");
            temp = temp.replaceAll("0"," ");
            answer[i] = temp;
        }

        return answer;
    }


}
