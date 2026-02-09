// pattern 1;

public class Pattern {

    public static void main(String[] args) {
        int n = 5;

        //pattern 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
// pattern 5;
// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

