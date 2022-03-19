package BOJ.Tree;

import java.util.Scanner;

public class S1_9934 {

    static int K;
    static int[] tree;
    static StringBuilder[] sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        tree = new int[(int) (Math.pow(2,K) - 1)];
        int length = tree.length;
        for (int i=0;i<length;i++){
            tree[i] = sc.nextInt();
        }
        sb = new StringBuilder[K];
        for (int i=0;i<K;i++){
            sb[i] = new StringBuilder();
        }
        recur(0, length - 1, 0);
        for (int i=0;i<K;i++){
            System.out.print(sb[i].toString() + "\n");
        }
    }
    public static void recur(int start, int end, int depth){
        if (depth == K){
            return;
        }
        int middle = (start + end) / 2;
        sb[depth].append(tree[middle]).append(" ");
        recur(start, middle - 1, depth + 1);
        recur(middle + 1, end, depth + 1);
    }
}
