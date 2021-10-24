package Programmers.LV2;

import java.util.Arrays;
import java.util.Stack;

public class Stock_Price {
    public static void main(String[] args) {
        Stock_Price s = new Stock_Price();
        int[] prices = new int[]{1,2,3,2,3};
        System.out.println(Arrays.toString(s.solution(prices)));
    }
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i=0;i< answer.length;i++){
            for (int j=i+1;j<answer.length;j++){
                answer[i]++;
                if (prices[i] > prices[j]){
                    break;
                }
            }
        }
        return answer;
    }
}
