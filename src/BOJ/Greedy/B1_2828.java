package BOJ.Greedy;

import java.util.Scanner;

public class B1_2828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int left = 1;
        int right = b;
        int count = 0;
        for (int i=0;i<c;i++){
            int dropLocation = sc.nextInt();

            if (left <= dropLocation && dropLocation <= right){
                continue;
            }
            if (left > dropLocation){
                count += (left - dropLocation);
                right -= (left - dropLocation);
                left = dropLocation;
            }else{
                count += (dropLocation - right);
                left += (dropLocation - right);
                right = dropLocation;
            }
        }
        System.out.println(count);
    }
}
