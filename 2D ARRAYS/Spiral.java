import java.io.*;
import java.util.*;

public class Spiral {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void printSpiral(int[][] arr) {

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = arr.length * arr[0].length;
        int count = 0;

        while (count < tne) {
            // left wall
            for (int i = minr, j = minc; i <= maxr && count < tne; i++) {
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            // bottom wall
            for (int i = maxr, j = minc; j <= maxc && count < tne; j++) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            // right wall
            for (int i = maxr, j = maxc; i >= minr && count < tne; i--) {
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            // top wall
            for (int i = minr, j = maxc; j >= minc && count < tne; j--) {
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        printSpiral(arr);
    }
}

// import java.util.*;

// public class Spiral {
// public static Scanner scn = new Scanner(System.in);

// public static void input(int[][] arr) {
// int n = arr.length; // REPRESENTS NUMBER OF ROWS
// int m = arr[0].length;// REPRESENTS NUMBER OF COLUMNS

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// arr[i][j] = scn.nextInt();
// }
// }
// }

// public static void spiral(int [][] arr)
// {
// int n=arr.length;
// int m=arr[0].length;
// int rmin=0, rmax=n-1;
// int cmin=0, cmax=m-1;
// int tnel=n*m;
// while(tnel>0)
// {
// for(int r=rmin; r<=rmax&&tnel>0;r++)
// {
// System.out.println(arr[r][cmin]);
// tnel--;
// }
// cmin++;
// for(int c=cmin;c<=cmax&&tnel>0;c++)
// {
// System.out.println(arr[rmax][c]);
// tnel--;
// }
// rmax--;
// for(int r=rmax;r>=rmin&&tnel>0;r--)
// {
// System.out.println(arr[r][cmax]);
// tnel--;
// }
// cmax--;
// for(int c=cmax;c>=cmin&&tnel>0;c--)
// {
// System.out.println(arr[rmin][c]);
// tnel--;
// }
// rmin++;
// }
// }

// public static void main(String[] args) {
// int[][] arr = new int[scn.nextInt()][scn.nextInt()];
// input(arr);
// spiral(arr);

// }

// }