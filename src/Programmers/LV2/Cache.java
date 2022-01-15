package Programmers.LV2;

import java.util.LinkedList;
import java.util.Queue;

public class Cache {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        for (int i=0;i< cities.length;i++){
            String city = cities[i].toLowerCase();
            if (queue.contains(city)){
                queue.remove(city);
                answer += 1;
                queue.add(city);
            }else{
                answer += 5;
                queue.add(city);
                if (queue.size() == cacheSize+1){
                    queue.poll();
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Cache cache = new Cache();
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(cache.solution(cacheSize, cities));
    }
}
