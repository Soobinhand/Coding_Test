package BOJ.Back_Tracking;

import java.util.Scanner;

public class G4_2580 {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[9][9];
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        backTracking(0,0);
    }
    static void backTracking(int row, int col){
        if (col == 9){
            backTracking(row+1, 0);
            return;
        }
        if (row == 9){
            for (int i=0;i<9;i++){
                for (int j=0;j<9;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.exit(0);
        }
        if (arr[row][col] == 0){
            for (int i=1;i<=9;i++){
                if (iAm0(row, col, i)){
                    arr[row][col] = i;
                    backTracking(row, col+1);
                }
            }
            arr[row][col] = 0;
            return;
        }
        backTracking(row, col+1);
    }
    static boolean iAm0(int row, int col, int value){
        for (int i=0;i<9;i++){
            if (arr[row][i] == value){
                return false;
            }
        }
        for (int i=0;i<9;i++){
            if (arr[i][col] == value){
                return false;
            }
        }
        int set_row = (row/3)*3;
        int set_col = (col/3)*3;
        for (int i=set_row;i<set_row+3;i++){
            for (int j=set_col;j<set_col+3;j++){
                if (arr[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
}
