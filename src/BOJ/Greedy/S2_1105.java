package BOJ.Greedy;

import java.util.Scanner;

public class S2_1105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        int answer = 0;
        if (a.length == b.length){
            for (int i=0;i<a.length;i++){
                if (a[i] == b[i] && a[i] == '8'){
                    answer++;
                }else if (a[i] != b[i]){
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
