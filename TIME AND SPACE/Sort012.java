// import java.io.*;
// import java.util.*;

// public class Sort012 {

//     public static void sort012(int[] arr) {
//         int n = arr.length;
//         int p1 = -1, p2 = n - 1, itr = 0;
//         while (itr <= p2) {
//             if (arr[itr] == 0)
//                 swap(arr, itr++, ++p1);
//             else if (arr[itr] == 2)
//                 swap(arr, itr, p2--);
//             else
//                 itr++;
//         }

//     }

//     // used for swapping ith and jth elements of array
//     public static void swap(int[] arr, int i, int j) {
//         System.out.println("Swapping index " + i + " and index " + j);
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         sort012(arr);
//         print(arr);
//     }

// }

// sumit malik way:-
import java.io.*;
import java.util.*;

public class Sort012 {

    public static void sort012(int[] arr) {
        int j = 0;// 0 to j-1 = 0's area
        int i = 0;// j to i-1 = 1's area
        int k = arr.length - 1; // k+1 to end= 2's area

        // i to k is unknown
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;

            } else {
                swap(arr, i, k);
                k--;
            }
        }

    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        print(arr);
    }

}