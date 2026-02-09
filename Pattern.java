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
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j); //j is used to create a number pyramid in which the numbers will be printed one after the other.
            }
            System.out.println();
        }
        System.out.println();

    }
}
