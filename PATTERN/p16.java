// import java.util.*;

// public class p16 {
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int sp = 2*n-3;
//         int st = 1;
//         for(int i =1; i<=n;i++){
//             for(int j =1;j<=st;j++){
//                 System.out.print("*\t");
//             }
//             for(int j =1;j<=sp;j++){
//                 System.out.print("\t");
//             }
//             if(i == n){
//                 st--;
//             }
//             for(int j =1;j<=st;j++){
//                 System.out.print("*\t");
//             }
//             st++;
//             sp -= 2;
//             System.out.println();

//         }
//     }

// }

import java.util.*;

public class p16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        hillTriangle(n);

    }

    public static void hillTriangle(int n) {
        int sp = 2 * n - 3;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "\t");
            }
            st++;
            sp -= 2;
            System.out.println();

        }

    }

}
