// THIS IS NORMAL VERSION OF BUUBLE SORT

//import java.io.*;
// import java.util.*;
// public class practice {
//     public static void bubbleSort(int[] arr) {
//         // write your code here
//         for (int i = 1; i <= arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i; j++) {
//                 if (isSmaller(arr, j + 1, j)) {
//                     swap(arr, j + 1, j);
//                 }
//             }
//         }
//     }
//     // used for swapping ith and jth elements of array
//     public static void swap(int[] arr, int i, int j) {
//         System.out.println("Swapping " + arr[i] + " and " + arr[j]);
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     // return true if ith element is smaller than jth element
//     public static boolean isSmaller(int[] arr, int i, int j) {
//         System.out.println("Comparing " + arr[i] + " and " + arr[j]);
//         if (arr[i] < arr[j]) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String[] args) throws Exception {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         bubbleSort(arr);
//         print(arr);
//     }
// }


// OPTIMIZED VERSION OF BUUBLE SORT

import java.io.*;
import java.util.*;

public class BubbleSort {
    public static void getBubbleSort(int[] arr) {
        int n = arr.length;
        for (int li = n - 1; li >= 0; li--) {
            boolean swapIsDone = false;
            for (int i = 1; i <= li; i++) {
                if (isSmaller(arr, i, i - 1)) {
                    swap(arr, i, i - 1);
                    swapIsDone = true;
                }
            }
            if (swapIsDone)
                break;
        }

    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        getBubbleSort(arr);
        print(arr);
    }
}