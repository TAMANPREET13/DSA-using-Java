import java.util.*;

public class Intro {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // String s1 = "hello wrong world"
        // String s1 = scn.nextLine()
        // String s2 = scn.nextLine()
        // System.out.println(s1)
        // System.out.println(s2)

        // String s = scn.nextLine()
        // System.out.println(s)
        // System.out.println(s.length())

        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // System.out.println(ch);
        // }

        // SUBSTRING FUNCTION

        // String s1 = "abcd"
        // System.out.println(s1.substring(0, 2))
        // System.out.println(s1.substring(1))

        // ADDITION OF TWO STRINGS

        // String s1 = "hello"
        // String s2 = " bad world"
        // String s3 = s1 + s2
        // s1 += " "
        // s1 += "W"
        // s1 += "O"
        // s1 += 10
        // System.out.println(s1)
        // System.out.println("Hello" + 10 + 20); // left to right operations are being
        // done

        // SPLIT FUNCTION

        String s = "abc,def,ghi jkl mno";
        String[] parts = s.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}