import java.util.*;

public class MaxMinFind {
    public static Scanner scn = new Scanner(System.in);



    public static int[] input2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static int maximum(int[] arr) {
        int maxEle = -(int) 1e9; // INTEGER.MIN_VALUE;
        for (int ele : arr) {
            maxEle = Math.max(maxEle, ele);

        }
        return maxEle;
    }

    public static int minimum(int[] arr){
        int minEle = (int) 1e9;
        for(int ele: arr){
            minEle = Math.min(minEle, ele);
        }
        return minEle;
    }
    public static int find(int[] arr, int data) {
        int foundAtIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                foundAtIndex = i;
                break;
            }
        }

        return foundAtIndex;
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input2(n);
        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
        System.out.print(find(arr,n));
    }
}

