package Programmers.LV2;

import java.util.LinkedList;
import java.util.Queue;

public class TruckBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int cnt = 0;
        int nowBridge = 0;
        Queue<Integer> bridge = new LinkedList<>();
        while (true){

            if (cnt == truck_weights.length){
                break;
            }

            if (bridge.size() == bridge_length){
                nowBridge -= bridge.poll();
            }
            else if (nowBridge + truck_weights[cnt] > weight){
                bridge.add(0);
                answer++;
            }else{
                bridge.add(truck_weights[cnt]);
                nowBridge += truck_weights[cnt];
                answer++;
                cnt++;
            }
        }
        return answer + bridge_length;
    }
    public static void main(String[] args) {
        TruckBridge truckBridge = new TruckBridge();
        System.out.println(truckBridge.solution(2,10, new int[]{
                7,4,5,6
        }));
    }
}
