package BOJ.Brute_Force;

import java.util.Scanner;

public class B2_18312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int hour = 0;
        int min = 0;
        int sec = 0;
        int cnt = 0;
        while (true){
            String time = ((hour<10)?"0"+hour:""+hour)+((min<10)?"0"+min:""+min)+((sec<10)?"0"+sec:""+sec);
            if (time.contains("" + k)) cnt++;
            if (hour==n&&min==59&&sec==59) break;
            sec++;
            if (sec==60){
                sec=0;
                min++;
            }
            if (min==60){
                min=0;
                hour++;
            }
        }
        System.out.println(cnt);
    }
}
