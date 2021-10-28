package Programmers.LV1;

import java.util.ArrayList;

public class Phone_Cat_Mon {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int size = nums.length/2;
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
                answer++;
            }
        }
        if(answer > size){
            answer = size;
        }
        return answer;
    }
}
