import java.util.*;

public class p5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
}

// public static void fullStar(int n) {
// int nst = 1, nsp = n / 2;
// for (int row = 1; row <= n; row++) {
// for (int csp = 1; csp <= nsp; csp++)
// System.out.print("\t");
// for (int cst = 1; cst <= nst; cst++)
// System.out.print("*\t");

// if (row <= n / 2) {
// nsp--;
// nst += 2;
// } else {
// nsp++;
// nst -= 2;
// }
// System.out.println();

// }
// }

// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// fullStar(n);
// }

// }
