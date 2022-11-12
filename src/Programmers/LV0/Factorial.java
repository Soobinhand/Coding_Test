package Programmers.LV0;

public class Factorial {
    public static void main(String[] args) {
        int n = 7;
        int m = 3628800;
        int result = solution(n);
        int result1 = solution(m);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(solution(3628799));
        System.out.println(solution(2));
    }

    public static int solution(int n) {
        int answer = 1;
        for (int i = 1; i <= n;i++){
            answer *= i;
            if (answer > n){
                answer = i-1;
                break;
            }else if(answer == n){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
