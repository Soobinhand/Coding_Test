package Programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_My_Mam_Daero {
    public String[] solution(String[] strings, int n){
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<strings.length;i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(list);
        answer = new String[list.size()];
        for (int i=0;i<list.size();i++){
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}
