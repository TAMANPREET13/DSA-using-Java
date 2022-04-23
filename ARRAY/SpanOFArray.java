// import java.io.*;
// import java.util.*;

// public class SpanOFArray {
//     public static void main(String[] args) throws Exception {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scn.nextInt();
//         }
//         int max = arr[0];
//         int min = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         int span = max - min;
//         System.out.println(span);
//     }
// }

import java.util.*;
import java.io.*;

public class SpanOFArray {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

    }

    public static void spanArray(int[] arr) {

        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxEle = Math.max(maxEle, arr[i]);
            minEle = Math.min(minEle, arr[i]);
        }

        System.out.println(maxEle - minEle);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];

        input(arr);

        spanArray(arr);

    }
}

// ALTERNATE LONG METHOD

// public static void spanArray(int[] arr) {

// int max =Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// if (arr[i] < min) {
// min = arr[i];
// }
// }

// System.out.println( max - min);
// }