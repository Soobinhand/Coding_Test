package Programmers.LV2;



public class JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String first = s.charAt(0)+"";
        answer.append(first.toUpperCase());

        for (int i=1;i<s.length();i++){
            String now = s.charAt(i)+"";
            if (s.charAt(i-1)==' '){
                answer.append(now.toUpperCase());
            }else{
                answer.append(now.toLowerCase());
            }
        }
        return answer.toString();
    }
}
