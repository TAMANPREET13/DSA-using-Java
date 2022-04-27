import java.io.*;
import java.util.*;

public class HI {
    public static Scanner scn = new Scanner(System.in);

    public static int countOfHi(String str) {
        int n = str.length();
        int i = 0, count = 0;
        while (i < n - 1) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hihihhhhihihhiihihhhhihi";
        System.out.println(countOfHi(str));
    }
}
