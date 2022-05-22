// import java.util.*;
// public class p7 {
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int i = 1; i<=n;i++){
//             for(int j =1;j<=n;j++){
//                 if(i==j){
//                     System.out.print("*\t");
//                 }
//                 else{
//                     System.out.print("\t");
//                 }
//             }
//             System.out.println();
//         }

//     }

// }

// import java.util.*;
// public class p7 {
//     public static void main(String[] args){
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int i = 1; i<=n;i++){
//             for(int j =1;j<=n;j++){
//                 if(i+j==n+1){
//                     System.out.print("*\t");
//                 }
//                 else{
//                     System.out.print("\t");
//                 }
//             }
//             System.out.println();
//         }

//     }

// }

// import java.util.*;

// public class p7 {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == j || i + j == n + 1) {
//                     System.out.print("*\t");
//                 } else {
//                     System.out.print("\t");
//                 }
//             }
//             System.out.println();
//         }

//     }

// }

import java.util.*;

public class p7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        twoSlash(n);

    }

    public static void twoSlash(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i+j == n+1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}