import java.util.*;

public class p6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n / 2 + 1;
        int sp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
            System.out.println();
        }
    }
}

// import java.util.*;
// public class p6{
// public static Scanner scn= new Scanner(System.in);
// public static void hollowDiamond(int n){
// int nst=n/2+1,nsp=1;
// for(int row=1;row<=n;row++){
// for(int cst=1;cst<=nst;cst++){
// System.out.print("*\t");
// }
// for(int csp=1;csp<=nsp;csp++){
// System.out.print("\t");
// }
// for(int cst=1;cst<=nst;cst++){
// System.out.print("*\t");
// }
// if(row<=n/2){
// nsp+=2;
// nst--;
// }
// else{
// nsp-=2;
// nst++;
// }
// System.out.println();
// }
// }

// public static void main(String[] args){
// int n = scn.nextInt();
// hollowDiamond(n);
// }
// }
