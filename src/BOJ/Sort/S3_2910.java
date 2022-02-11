package BOJ.Sort;

import java.util.*;

public class S3_2910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i=0;i<a;i++){
            int temp = sc.nextInt();
            if (map.containsKey(temp)){
                map.replace(temp, map.get(temp)+1);
            }else{
                map.put(temp, 1);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>(map.keySet());
        arrayList.sort((o1, o2) -> Integer.compare(map.get(o2), map.get(o1)));
        for (int ele : arrayList) {
            for (int i = 0; i < map.get(ele); i++) {
                System.out.print(ele + " ");
            }
        }
    }
}
