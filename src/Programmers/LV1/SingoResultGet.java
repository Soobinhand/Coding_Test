package Programmers.LV1;

import java.util.*;

public class SingoResultGet {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        for (int i=0;i< id_list.length;i++){
            result.put(id_list[i], 0);
            map.put(id_list[i], new HashSet<>());
        }
        for(int i=0;i<report.length;i++){
            StringTokenizer st = new StringTokenizer(report[i]);
            String singoza = st.nextToken();
            String criminal = st.nextToken();
            map.get(criminal).add(singoza);
        }
        for (int i=0;i<id_list.length;i++){
            if (map.get(id_list[i]).size() >= k){ // 범죄자
                Iterator<String> setOne = map.get(id_list[i]).iterator();
                while (setOne.hasNext()){
                    String temp = setOne.next();
                    int tempp = result.get(temp);
                    tempp++;
                    result.put(temp, tempp);
                }
            }
        }
        for (int i=0;i< id_list.length;i++){
            answer[i] = result.get(id_list[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {
                "muzi",
                "frodo",
                "apeach",
                "neo"
        };
        String[] report = {
                "muzi frodo",
                "apeach frodo",
                "frodo neo",
                "muzi neo",
                "apeach muzi"
        };
        int k = 2;
        SingoResultGet solution = new SingoResultGet();
        System.out.println(Arrays.toString(solution.solution(id_list, report, k)));
    }
}
