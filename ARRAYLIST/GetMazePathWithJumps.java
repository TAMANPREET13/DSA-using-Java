import java.io.*;
import java.util.*;

public class GetMazePathWithJumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePath(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePath(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        for (int jump = 1; sc + jump <= ec; jump++) {
            ArrayList<String> horizontal = getMazePath(sr, sc + jump, er, ec);
            for (String s : horizontal)
                myAns.add("h" + jump + s);
        }
        for (int jump = 1; sr + jump <= er; jump++) {
            ArrayList<String> vertical = getMazePath(sr + jump, sc, er, ec);
            for (String s : vertical)
                myAns.add("v" + jump + s);
        }
        for (int jump = 1; sc + jump <= ec && sr + jump <= er; jump++) {
            ArrayList<String> diagonal = getMazePath(sr + jump, sc + jump, er, ec);
            for (String s : diagonal)
                myAns.add("d" + jump + s);
        }
        return myAns;
    }
}

// import java.io.*;
// import java.util.*;

// public class practice {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int m = scn.nextInt();
// System.out.println(getMazePaths(1, 1, n, m)); // (0,0,n-1,m-1)
// }

// public static ArrayList<String> getMazePaths(int sr, int sc, int er, int ec)
// {
// if (sr == er && sc == ec) {
// ArrayList<String> bres = new ArrayList<>();
// bres.add("");
// return bres;
// }
// ArrayList<String> mr = new ArrayList<>();
// for (int jump = 1; jump <= ec - sc; jump++) {
// ArrayList<String> rr = getMazePaths(sr, sc + jump, er, ec);
// for (int i = 0; i < rr.size(); i++) {
// mr.add("h" + jump + rr.get(i));
// }
// }
// for (int jump = 1; jump <= er - sr; jump++) {
// ArrayList<String> rr = getMazePaths(sr + jump, sc, er, ec);
// for (int i = 0; i < rr.size(); i++) {
// mr.add("v" + jump + rr.get(i));
// }
// }
// for (int jump = 1; jump <= er - sr && jump <= ec - sc; jump++) {
// ArrayList<String> rr = getMazePaths(sr + jump, sc + jump, er, ec);
// for (int i = 0; i < rr.size(); i++) {
// mr.add("d" + jump + rr.get(i));
// }
// }
// return mr;
// }
// }
