package Programmers.LV1;

import java.util.*;

public class Fail_Percent {
    public static void main(String[] args) {
        int N = 5;
        int M = 4;
        int[] stages = new int[]{2,1,2,6,2,4,3,3};
        int[] stages1 = new int[]{4,4,4,4,4};
        System.out.println(Arrays.toString(new Fail_Percent().solution(N, stages)));
        System.out.println(Arrays.toString(new Fail_Percent().solution(M, stages1)));
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageStatus = new int[N+1];
        for (int i : stages){
            if (i == N+1)
                continue;
            stageStatus[i]++;
        }

        Map<Integer, Double> map = new HashMap<>();
        int len = stages.length;
        for (int i = 1;i <=N;i++){
            if (len == 0){
                map.put(i,(double)0);
            }
            else{
                double rate = (double) stageStatus[i]/(double) len;
                len -= stageStatus[i];
                map.put(i, rate);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Double.compare(map.get(o2), map.get(o1));
            }
        });
        for (int i = 0; i<N;i++){
            answer[i] = list.get(i);
        }
        return answer;

    }
}
