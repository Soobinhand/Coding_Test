package BOJ.Brute_Force;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S4_5568 {
    static int n;
    static int k;
    static String[] arr;
    static String[] list;
    static Set<String> set;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new String[n];
        list = new String[k];
        visit = new boolean[n];
        for (int i=0;i<n;i++){
            arr[i] = br.readLine();
        }
        set = new HashSet<>();
        permutation(0);
        System.out.println(set.size());
    }

    static void permutation(int depth){
        if (depth == k){
            String sum = "";
            for (int i=0;i<list.length;i++){
                sum += list[i];
            }
            set.add(sum);
            return;
        }
        for (int i=0;i<n;i++){
            if (!visit[i]){
                visit[i] = true;
                list[depth] = arr[i];
                permutation(depth + 1);
                visit[i] = false;
            }
        }
    }
}
