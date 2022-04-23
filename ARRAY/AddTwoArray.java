

import java.io.*;
import java.util.*;

public class AddTwoArray {

    public static void sumOfArray(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = c + (i >= 0 ? a1[i] : 0) + (j >= 0 ? a2[j] : 0);
            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if (c != 0) {
            System.out.println(c);
        }
        for (int val : sum) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int j = 0; j < a2.length; j++) {
            a2[j] = scn.nextInt();
        }
        sumOfArray(a1, a2);
    }
}
// import java.util.*;
// import java.io.*;
// public class AddTwoArray {
// public static Scanner scn = new Scanner(System.in);
// public static int[] input1(int n) {
// int[] arr1 = new int[n];
// for (int i = 0; i < arr1.length; i++) {
// arr1[i] = scn.nextInt();
// }
// return arr1;
// }
// public static int[] input2(int m) {
// int[] arr2 = new int[m];
// for (int i = 0; i < arr2.length; i++) {
// arr2[i] = scn.nextInt();
// }
// return arr2;
// }
// public static void sumOFArray(int[] arr1, int[] arr2) {
// int n = arr1.length;
// int m = arr2.length;
// int p = Math.max(n, m) + 1;
// int[] ans = new int[p];
// int i = n - 1;
// int j = m - 1;
// int k = p - 1;
// int carry = 0;
// while (k >= 0) {
// int sum = carry + (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0);
// ans[k] = sum % 10;
// carry = sum / 10;
// i--;
// j--;
// k--;
// }
// for (int idx = 0; idx < p; idx++) {
// if (idx == 0 && ans[idx] == 0)
// continue;
// System.out.print(ans[idx]);
// }
// }

// public static void main(String[] args) throws Exception {
// int n = scn.nextInt();
// int[] arr1 = input1(n);
// int m = scn.nextInt();
// int[] arr2 = input2(m);
// sumOFArray(arr1, arr2);
// }

// }