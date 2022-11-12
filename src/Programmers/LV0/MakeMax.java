package Programmers.LV0;

import java.util.ArrayList;
import java.util.Collections;

public class MakeMax {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers){
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : numbers){
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        answer = arrayList.get(arrayList.size()-1) * arrayList.get(arrayList.size() - 2);
        return answer;
    }
}
