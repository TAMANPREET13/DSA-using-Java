import java.util.*;

public class Wakanda1 {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length; // REPRESENTS NUMBER OF ROWS
        int m = arr[0].length;// REPRESENTS NUMBER OF COLUMNS

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    // public static void stateOfWakanda(int[][] arr) {   //STATE OF WAKANDA 1
    // int n = arr.length;
    // int m = arr[0].length;
    // for (int j = 0; j < m; j++) {
    // if (j % 2 == 0) {
    // for (int i = 0; i < n; i++) {
    // System.out.println(arr[i][j]);
    // }
    // } else {
    // for (int i = n - 1; i >= 0; i--)
    // System.out.println(arr[i][j]);

    // }

    // }
    // }

    public static void stateOfWakanda_FB(int[][] arr) { // SPECIAL CASE OF STATE OF WAKANDA 1
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.println(arr[i][j]);
                }
            } else {
                for (int j = m - 1; j >= 0; j--)
                    System.out.println(arr[i][j]);

            }

        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        stateOfWakanda_FB(arr);

    }

}
