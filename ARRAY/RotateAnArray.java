// import java.util.*;

// public class RotateAnArray {
//     public static Scanner scn = new Scanner(System.in);

//     public static int[] input2(int n) {
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt(); // set
//         }
//         return arr;
//     }

//     public static void display(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static int[] rotate(int[] arr, int r) {
//         int n = arr.length;
//         r %= n;
//         if (r < 0) {
//             r += n;
//         }
//         int[] ans = new int[n];
//         for (int i = 0; i < n; i++) {
//             int idx = (i + r) % n;
//             ans[idx] = arr[i];
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         int[] arr = input2(n);
//         int r = scn.nextInt();
//         int[] ans = rotate(arr, r);
//         display(ans);

//     }

// }

import java.io.*;
import java.util.*;

public class RotateAnArray {
    public static Scanner scn = new Scanner(System.in);

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] arr, int i, int j) {
        int li = i;
        int ri = j;
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }

        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr, k);
        display(arr);
    }
}
