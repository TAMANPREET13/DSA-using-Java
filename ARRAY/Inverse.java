import java.io.*;
import java.util.*;

public class Inverse {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void display(int[] ans) {
        int n = ans.length;
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + "\n");
        }
    }

    public static void inverseAnArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = arr[i];
            ans[idx] = i;

        }
        display(ans);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];

        input(arr);

        inverseAnArray(arr);

    }
}
