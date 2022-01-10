package Programmers.LV2;

import java.util.*;

public class Open_Chat_Room {
    public String[] solution(String[] record) {
        int count = 0;
        for (String value : record) {
            if (value.contains("Change")) {
                count++;
            }
        }

        String[] answer = new String[record.length-count];

        Map<String, String> map = new HashMap<>();

        for (int i=0;i< record.length;i++) {
            StringTokenizer st = new StringTokenizer(record[i]);
            while (st.hasMoreElements()) {
                switch (st.nextToken()) {
                    case "Enter":
                    case "Change":
                        map.put(st.nextToken(), st.nextToken());
                        break;
                    case "Leave"://맵 제거하면 값이 null 로 나옴옴
                        st.nextToken();
                        break;
                }
            }
        }

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i=0;i< record.length;i++){
            StringTokenizer st = new StringTokenizer(record[i]);
            while (st.hasMoreElements()){
                switch (st.nextToken()) {
                    case "Enter":
                        arrayList.add(map.get(st.nextToken())+"님이 들어왔습니다.");
                        break;
                    case "Leave":
                        arrayList.add(map.get(st.nextToken())+"님이 나갔습니다.");
                        break;
                }
            }
        }

        for (int i=0;i< arrayList.size();i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Open_Chat_Room solution = new Open_Chat_Room();
        String[] record = new String[]{
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
        System.out.println(Arrays.toString(solution.solution(record)));
    }
}
