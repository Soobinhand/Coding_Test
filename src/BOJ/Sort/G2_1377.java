package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class G2_1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrSize = Integer.parseInt(br.readLine());
        data[] arr = new data[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i] = new data(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i=0;i<arrSize;i++){
            if (max < arr[i].index - i){
                max = arr[i].index - i;
            }
        }
        System.out.println(max + 1);
    }
}

class data implements Comparable<data>{
    int value;
    int index;

    public data(int value, int index){
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(data o){
        return this.value - o.value;
    }
}
