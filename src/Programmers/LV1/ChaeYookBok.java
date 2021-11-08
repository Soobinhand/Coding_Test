package Programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ChaeYookBok {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = new int[]{2,4};
        int[] reserve = new int[]{1,3,5};
        System.out.println(new ChaeYookBok().solution(n,lost,reserve));
    }
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i=0;i<lost.length;i++){
            for (int j=0;j< reserve.length;j++){
                if (lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int k : lost) {
            for (int j = 0; j < reserve.length; j++) {
                if ((k - 1 == reserve[j]) || (k + 1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
