// import java.util.*;

// public class Intro {
//     public static int[] input2(int n) {
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt(); // set
//         }

//         return arr;
//     }

//     public static int maximum(int[] arr){

//     }

//     public static int minimum(int[] arr){

//     }

//     // if you found return index, otherwise return -1.
//     public static int find(int[] arr,int data){

//     }

//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         int[] arr = input2(n);
//     }

// }

// import java.util.*;
// public class Intro{
//     public static Scanner scn = new Scanner(System.in);

//     public static void test1(int n){
//         int[] arr = new int[n];
//         for(int i = 0; i<n; i++){
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String[] args){
//         int n = scn.nextInt();
//         test1(n);
//     }

// }

import java.util.*;

public class Intro {
    public static Scanner scn = new Scanner(System.in);

    public static void display1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void input1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void main(String[] args){
        //int n = scn.nextInt();
        int[] arr = new int[5];
        input1(arr);
        display1(arr);
    }
}
