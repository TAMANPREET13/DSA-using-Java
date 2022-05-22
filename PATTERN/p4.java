import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}

// import java.util.*;

// public class p4 {
// public static void mirrorTriangle(int n) {
// int nst = n;
// int nsp = 0;
// for (int row = 1; row <= n; row++) {
// for (int csp = 1; csp <= nsp; csp++)
// System.out.print("\t");
// for (int cst = 1; cst <= nst; cst++)
// System.out.print("*\t");
// nst--;
// nsp++;
// System.out.println();
// }

// }

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// mirrorTriangle(n);
// }

// }
