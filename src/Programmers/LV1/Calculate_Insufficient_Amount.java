package Programmers.LV1;

public class Calculate_Insufficient_Amount {
    public long solution(int price, int money, int count){
        long answer = -1;
        long sum = 0;
        for (int i=1;i<count+1;i++){
            sum += (long) price *i;
        }
        answer = (sum - money);
        if(answer <= 0){
            answer = 0;
        }
        return answer;
    }

}
