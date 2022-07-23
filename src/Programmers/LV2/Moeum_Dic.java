package Programmers.LV2;

public class Moeum_Dic {
    public int solution(String word){
        int answer = 0;
        String str = "AEIOU";
        int[] x = {781, 156, 31, 6, 1};
        int index;
        answer = word.length();
        for (int i=0;i<word.length();i++){
            index = str.indexOf(word.charAt(i));
            answer += x[i] * index;
        }
        return answer;
    }
}
