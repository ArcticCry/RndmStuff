import java.util.Scanner;

public class HowManyDivisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers from which you want divisor, 1-100 only (inclusive). You can enter 3 numbers, if want less, then just type 0 instead");
        System.out.print("Number 1: ");
        int a = sc.nextInt();
        while (a <1 || a >100) {
            System.out.println("1please enter a number between 1-100 (inclusive) you raccoon");
            a = sc.nextInt();
        }
        System.out.print("Number 2: ");
        int b = sc.nextInt();
        while (b <1 || b >100) {
            System.out.println("2please enter a number between 1-100 (inclusive) you raccoon");
            b = sc.nextInt();
        }
        System.out.print("Number 3: ");
        int c = sc.nextInt();
        while (c <1 || c >100) {
            System.out.println("3please enter a number between 1-100 (inclusive) you raccoon");
            c = sc.nextInt();
        }

        int l=1,m=1,n=1;

        for (int i=1; i<a; i++) {
            if (a % i==0) {
                l++;
            }
        }
        for (int i=1; i<b; i++) {
            if (b % i==0) {
                m++;
            }
        }
        for (int i=1; i<c; i++) {
            if (c % i==0) {
                n++;
            }
        }



        System.out.println("amount of divisors of " + a + " is: " + l);
        System.out.println("amount of divisors of " + b + " is: " + m);
        System.out.println("amount of divisors of " + c + " is: " + n);


    }
}
