package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String answerString="";
        String answerString1="";
        for (int i=0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            String day = st.nextToken();
            if (day.length()==1){
                day = "0"+day;
            }
            String month = st.nextToken();
            if (month.length()==1){
                month = "0"+month;
            }
            String year = st.nextToken();
            String temp = year+month+day;
            int answerInt = Integer.parseInt(temp);
            if (max < answerInt){
                max = answerInt;
                answerString = str;
            }
            if (min > answerInt){
                min = answerInt;
                answerString1 = str;
            }
        }
        System.out.println(answerString+"\n"+answerString1);
    }
}
