package Programmers.LV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class max_min {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i< a.length;i++){
            list.add(Integer.parseInt(a[i]));
        }
        answer =""+Collections.min(list)+" "+Collections.max(list);
        return answer;
    }
}
