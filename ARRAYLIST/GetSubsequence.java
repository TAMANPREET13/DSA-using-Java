import java.io.*;
import java.util.*;

public class GetSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str); // gss-get substring
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0); // a
        String ros = str.substring(1);// bc
        ArrayList<String> rres = gss(ros); // [--,-c,b-,bc]

        ArrayList<String> myres = new ArrayList<>();
        for (String rstr : rres) {
            myres.add("" + rstr);
        }
        for (String rstr : rres) {
            myres.add(ch + rstr);
        }
        return myres;
    }
}

// import java.util.*;

// public class practice {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// String str = scn.nextLine();
// System.out.println(gss(str));
// }

// public static ArrayList<String> gss(String str) {
// if (str.length() == 0) {
// ArrayList<String> bans = new ArrayList<>();
// bans.add("");
// return bans;
// }
// char ch = str.charAt(0);
// String ros = str.substring(1);
// ArrayList<String> rr = gss(ros);

// ArrayList<String> mr = new ArrayList<>();
// for (int i = 0; i < rr.size(); i++) {
// mr.add(rr.get(i));
// }
// for (int i = 0; i < rr.size(); i++) {
// mr.add(ch + rr.get(i));
// }
// return mr;
// }
// }