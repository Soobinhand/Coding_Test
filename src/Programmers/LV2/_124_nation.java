package Programmers.LV2;

public class _124_nation {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(new _124_nation().solution(n));
    }
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int remainder = n % 3;
            if (remainder == 0){
                sb.append("4");
                n -= 1;
            }else if(remainder == 1){
                sb.append("1");
            }else{
                sb.append("2");
            }


            n /= 3;
        }
        return sb.reverse().toString();
    }
}
