package BOJ.Greedy;

import java.util.*;

public class G5_1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> crane = new ArrayList<>();
        for (int i=0;i<a;i++){
            crane.add(sc.nextInt());
        }
        crane.sort(Collections.reverseOrder());
        int b = sc.nextInt();
        ArrayList<Integer> box = new ArrayList<>();
        for (int i=0;i<b;i++){
            box.add(sc.nextInt());
        }
        box.sort(Comparator.reverseOrder());
        if (crane.get(0) < box.get(0)){
            System.out.println(-1);
        }else{
            int answer = 0;
            while (!box.isEmpty()){
                int width = 0;
                for (int i=0;i< crane.size();){
                    if (width == box.size()){
                        break;
                    }else if (crane.get(i) >= box.get(width)){
                        i++;
                        box.remove(width);
                    }else{
                        width++;
                    }
                }
                answer++;
            }
            System.out.println(answer);
        }
    }

}
