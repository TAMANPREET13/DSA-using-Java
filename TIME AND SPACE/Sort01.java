// import java.io.*;
// import java.util.*;

// public class Sort01 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         getSort01(arr);
//         print(arr);

//     }

//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void swap(int[] arr, int i, int j) {
//         System.out.println("Swapping index " + i + " and index " + j);
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void getSort01(int[] arr) {
//         int p = -1;
//         int itr = 0;
//         while (itr < arr.length) {
//             if (arr[itr] == 0) {
//                 swap(arr, itr,++p);
//             }
//             itr++;
//         }
//     }
// }

// summit malik way:-
import java.io.*;
import java.util.*;

public class Sort01 {

    public static void sort01(int[] arr) {
        int i =0 ;
        int j =0;
        while(i<arr.length){
            if(arr[i] == 1){
                i++;
            }else{
                swap(arr, i, j);
                i++;
                j++;
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
        sort01(arr);
        print(arr);
    }

}