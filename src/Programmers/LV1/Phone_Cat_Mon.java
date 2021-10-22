package Programmers.LV1;

import java.util.ArrayList;

public class Phone_Cat_Mon {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int size = nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                answer++;
            }
        }
        if(answer > size){
            answer = size;
        }
        return answer;
    }
}
