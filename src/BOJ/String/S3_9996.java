package BOJ.String;

import java.util.Scanner;
import java.util.StringTokenizer;
// 백준 <S3_9996 한국이 그리울 땐 서버에 접속하지> 해결
// 문자열
public class S3_9996{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        StringTokenizer st = new StringTokenizer(str,"*");
        String first = st.nextToken();
        String second = st.nextToken();
        for (int i=0;i<a;i++){
            String temp = sc.next();
            if (temp.startsWith(first)){
                temp = temp.substring(first.length());
                if (temp.endsWith(second)){
                    System.out.println("DA");
                }else{
                    System.out.println("NE");
                }
            }else{
                System.out.println("NE");
            }
        }
    }
}