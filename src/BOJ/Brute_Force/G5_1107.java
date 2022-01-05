package BOJ.Brute_Force;

import java.util.Scanner;

public class G5_1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();// 첫째줄 입력
        int numberOfNotWorking = sc.nextInt(); // 둘째줄 입력
        boolean[] isBreak = new boolean[10];// 몇 번이 고장난건지 확인하기 위해서 false로 초기화된 0-9까지의 배열
        for (int i=0;i<numberOfNotWorking;i++){
            isBreak[sc.nextInt()] = true;//들어오는 숫자를 인덱스로 받아서 해당 숫자는 true로 바꿔서 고장난걸로 생각함.
        }
        int result = Math.abs(target - 100);//그냥 +-만 누르면 되는걸 초기화로 함.
        for (int i = 0; i<=999999;i++){//최댓값이 500000인데 9 제외하고 다 고장나면 999999눌러야 하니까 범위를 이렇게 정해줌
            boolean b = false;//고장난건지 아닌지 확인.
            String str = String.valueOf(i);//숫자를 문자열로 바꿈.
            int len = str.length();
            for (int j = 0; j<len;j++){
                if (isBreak[str.charAt(j) - '0']){//하나라도 고장난 버튼을 눌러야 한다면
                    b = true;
                    break;//빠져나온다.
                }
            }
            if (!b){//누른것중에 하나도 고장난게 없으면 실행됨. 그래서 b 가 있어야 하는 것임.
                int min = Math.abs(target-i) + len;//target - i 는 +- 갯수고, len 은 숫자 길이임.
                // 숫자 길이는 리모컨에서 누르는 횟수랑 같은거임. 근데 그중에
                // 고장난게 없으면 여기와서 눌른거고 그 길이만큼 더해주고 남은 만큼 ++--가 진행되는 것임.
                result = Math.min(result, min);//맨처음 result 와 비교해서 더 작은걸 찾는 과정..
            }
        }
        System.out.println(result);

    }
}
