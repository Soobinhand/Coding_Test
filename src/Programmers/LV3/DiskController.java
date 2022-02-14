package Programmers.LV3;

import java.util.*;

public class DiskController {
    public int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        ArrayList<int[]> arrayList = new ArrayList<>();
        int count = 0;
        int jobCount = 0;
        int end = 0;
        while (count < jobs.length){
            while (jobCount < jobs.length && jobs[jobCount][0] <= end){
                arrayList.add(jobs[jobCount]);
                jobCount++;
            }
            arrayList.sort(((o1, o2) -> o1[1] - o2[1]));
            if (arrayList.isEmpty()){
                end = jobs[jobCount][0];
            }else{
                int[] temp = arrayList.remove(0);
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;
            }
        }

        return answer/ jobs.length;
    }


}