import java.util.*;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        // System.out.println(sb.toString());

        // char ch = sb.charAt(0); //get
        // System.out.println(ch);

        sb.setCharAt(0, 'd'); //update
        System.out.println(sb.toString());

        sb.insert(2, 'y'); //insert
        System.out.println(sb.toString());

        sb.deleteCharAt(3); //delete
        System.out.println(sb.toString());

        sb.append('g'); // append
        System.out.println(sb.toString());
    }
}
