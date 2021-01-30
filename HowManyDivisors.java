import java.util.Scanner;

public class HowManyDivisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers from which you want to know its amount of divisors.\nAny number between 1-100 (inclusive)");
        System.out.print("Number 1: ");
        int a = sc.nextInt();
        while (a <1 || a >100) {
            System.out.print("Please enter a number between 1-100 (inclusive) you raccoon: ");
            a = sc.nextInt();
        }
        System.out.print("Number 2: ");
        int b = sc.nextInt();
        while (b <1 || b >100) {
            System.out.print("Please enter a number between 1-100 (inclusive) you raccoon: ");
            b = sc.nextInt();
        }
        System.out.print("Number 3: ");
        int c = sc.nextInt();
        while (c <1 || c >100) {
            System.out.print("Please enter a number between 1-100 (inclusive) you raccoon: ");
            c = sc.nextInt();
        }
        //code above gets 3 numbers from the user, and makes sure they're not below 1 or above 100

        int l=0,m=0,n=0; //these ints will be the amount of divisors

        //these for loops go through all numbers from 1- to the user chosen number,
        // and increases value of int l,m,n every time it recognizes a valid divisor
        for (int i=1; i<=a; i++) {
            if (a % i==0) {
                l++;
            }
        }
        for (int i=1; i<=b; i++) {
            if (b % i==0) {
                m++;
            }
        }
        for (int i=1; i<=c; i++) {
            if (c % i==0) {
                n++;
            }
        }

        //prints out final answer
        System.out.println(a + " has " + l + " divisors.");
        System.out.println(b + " has " + m + " divisors.");
        System.out.println(c + " has " + n + " divisors.");
    }
}
