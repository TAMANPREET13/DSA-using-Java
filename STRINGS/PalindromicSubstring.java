// malik way
// import java.io.*;
// import java.util.*;

// public class PalindromicSubstring {
//     public static boolean isPalindrome(String s) {
//         int i = 0;
//         int j = s.length() - 1;
//         while (i < j) {
//             char ch1 = s.charAt(i);
//             char ch2 = s.charAt(j);

//             if (ch1 != ch2) {
//                 return false;
//             } else {
//                 i++;
//                 j--;
//             }
//         }
//         return true;
//     }

//     public static void solution(String s) {
//         for (int i = 0; i <= s.length() - 1; i++) {
//             for (int j = i + 1; j <= s.length(); j++) {
//                 String ss = s.substring(i, j);
//                 if (isPalindrome(ss) == true) {
//                     System.out.println(ss);
//                 }
//             }
//         }

//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String str = scn.next();
//         solution(str);
//     }

// }

// jitender way
import java.io.*;
import java.util.*;

public class PalindromicSubstring {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void solution(String str) {
        for (int si = 0; si < str.length(); si++) {
            for (int ei = si; ei < str.length(); ei++) {
                if (isPalindrome(str.substring(si, ei + 1)) == true) {
                    System.out.println(str.substring(si, ei + 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}