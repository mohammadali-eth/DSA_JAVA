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
                System.out.print("*"); // 
            }
            System.out.println();
        }
        System.out.println();

        //pattern 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); //j is used to create a number pyramid in which the numbers will be printed one after the other.
            }
            System.out.println();
        }
        System.out.println();

        //pattern 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); //i is used to create a number pyramid in which one number is printed once and another number is printed twice.
            }
            System.out.println();
        }
        System.out.println();

        //pattern 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { //(n-i) is used to create a number pyramid in which the numbers will be printed in reverse order.
                System.out.print(j); //j is used to create a number pyramid in which the numbers will be printed one after the other.
            }
            System.out.println();
        }
        System.out.println();

        //pattern 7;
        for (int i = 0; i < n; i++) {

            for (int j = n - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 8;
        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            // for (int j = 0; j < 2 * i + 1; j++) {
            //     System.out.print("* ");
            // }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //pattern 9;
        patternNine();
        System.out.println();

        //pattern 10
        patternTen();
        System.out.println();

        //pattern 11
        patternEleven();
        System.out.println();

        //pattern 12
        pattern12();
        System.out.println();

        //pattern 13
        pattern13();
        System.out.println();

        //pattern 14
        pattern14();
        System.out.println();

        //pattern 15
        pattern15();
        System.out.println();

        //pattern 16;
        pattern16();
        System.out.println();
    }

//pattern 9
    static void patternNine() {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern 10
    static void patternTen() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pattern 11
    static void patternEleven() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { //even number for odd number white ' != '
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //pattern 12
    static void pattern12() {
        int n = 5;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 4 - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 4 - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // pattern 13
    static void pattern13() {
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    //pattern 14
    static void pattern14() {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = 'a';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    //pattern 15
    static void pattern15() {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = 'a';
            for (int j = i; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    //pattern 16
    static void pattern16() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            char ch = 'a';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
