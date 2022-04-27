import java.util.*;

public class Time {

    public static void time(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }

    public static void main(String[] args) {
        int n = 1000000;
        // String s = "";
        // for (int i = 0; i < n; i++) {
        // s += i;
    }

}
// this is to tell that stringBuilder are much faster then normal string method
// because it has a complexity of n^2 for a simple for loop
