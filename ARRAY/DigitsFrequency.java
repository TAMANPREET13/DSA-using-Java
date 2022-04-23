import java.util.*;
import java.io.*;

// public class DigitsFrequency {
//     public static Scanner scn = new Scanner(System.in);

//     public static int getDigitFrequency(int n, int d){
//         int count = 0;
//         while(n != 0){
//             int lastDigit = n%10;
//             n /= 10;
//             if(lastDigit == d){
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         int d = scn.nextInt();
//         int f = getDigitFrequency(n, d);
//         System.out.println(f);
//     }
// }

// MODIFIED VERSION OF THIS QUESTION:-

public class DigitsFrequency {
    public static Scanner scn = new Scanner(System.in);

    public static void displayFrequencyOfDigits(int n, int[] query) {
        int[] freq = new int[10];
        while (n != 0) {
            long d = n % 10;
            n /= 10;
            freq[(int) d]++;

        }
        for (int q : query) {
            System.out.print(freq[q]);
        }

    }

    public static void main(String[] args) {
        long n = scn.nextInt();
        int[] query = new int[scn.nextInt()];
        for (int i = 0; i < query.length; i++) {
            query[i] = scn.nextInt();
        }
        displayFrequencyOfDigits((int) n, query);
    }
}