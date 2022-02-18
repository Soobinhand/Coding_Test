package BOJ.Impl;

import java.util.*;

public class B3_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][2];
        for (int i=0;i<5;i++){
            arr[i][0] = i+1;
            arr[i][1] = sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        System.out.println(arr[4][0]+" "+arr[4][1]);
    }
}
