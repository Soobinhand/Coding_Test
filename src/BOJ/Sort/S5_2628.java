package BOJ.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S5_2628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> widthArr = new ArrayList<>();
        List<Integer> heightArr = new ArrayList<>();
        widthArr.add(sc.nextInt());
        heightArr.add(sc.nextInt());
        widthArr.add(0);
        heightArr.add(0);
        int testCase = sc.nextInt();
        for (int i=0;i<testCase;i++){
            int type = sc.nextInt();
            int point = sc.nextInt();
            if (type == 0){
                heightArr.add(point);
            }else{
                widthArr.add(point);
            }
        }
        Collections.sort(widthArr);
        Collections.sort(heightArr);
        int width = 0;
        int height = 0;
        int MAX = 0;
        for (int i=1;i< widthArr.size();i++){
            for (int j=1;j<heightArr.size();j++){
                width = widthArr.get(i) - widthArr.get(i-1);
                height = heightArr.get(j) - heightArr.get(j-1);
                MAX = Math.max(MAX, width * height);
            }
        }
        System.out.println(MAX);
    }
}
