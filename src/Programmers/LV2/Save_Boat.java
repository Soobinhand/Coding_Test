package Programmers.LV2;

import java.util.Arrays;

public class Save_Boat {
    public static void main(String[] args) {
        int[] people = new int[]{70,50,80,50};
        int limit = 100;
        System.out.println(new Save_Boat().solution(people,limit));
    }
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int minimum = 0;
        for (int i = people.length-1; minimum <= i; i--){
            if (people[i] + people[minimum] <= limit){
                minimum++;
            }
            answer++;
        }



        return answer;
    }
}
