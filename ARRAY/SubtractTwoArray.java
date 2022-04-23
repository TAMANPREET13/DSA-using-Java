import java.io.*;
import java.util.*;

public class SubtractTwoArray {

    public static void subtractTwoArray(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        int[] diff = new int[n2];
        int c = 0;
        int i = n1 - 1;
        int j = n2 - 1;
        int k = diff.length - 1;
        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? a1[i] : 0;
            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
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
        subtractTwoArray(a1, a2);
    }
}