package BOJ.Greedy;

import java.util.*;

public class S2_14241 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<a;i++){
            arrayList.add(sc.nextInt());
        }
        int score = 0;
        arrayList.sort(Collections.reverseOrder());
        while (true){
            if (!arrayList.isEmpty()){
                int size = arrayList.get(0) + arrayList.get(1);
                score += (arrayList.remove(0) * arrayList.remove(0));
                arrayList.add(size);
            }
            if (arrayList.size()==1){
                break;
            }
        }
        System.out.println(score);
    }
}
