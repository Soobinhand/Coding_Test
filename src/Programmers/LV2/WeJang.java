package Programmers.LV2;

import java.util.HashMap;
import java.util.Iterator;

public class WeJang {
    public static void main(String[] args) {
        WeJang weJang = new WeJang();
        String[][] clothes = {
                {"yellowhat","headgear"},
                {"bluesunglasses","eyewear"},
                {"green_turban","headgear"}
        };
        System.out.println(weJang.solution(clothes));
    }
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0;i< clothes.length;i++){
            String key  = clothes[i][1];
            if (!hashMap.containsKey(key)){
                hashMap.put(key, 1);
            }else{
                hashMap.put(key, hashMap.get(key)+1);
            }
        }
        Iterator<Integer> iterator = hashMap.values().iterator();
        while (iterator.hasNext()){
            answer *= iterator.next().intValue() + 1;
        }

        return answer-1;
    }
}
