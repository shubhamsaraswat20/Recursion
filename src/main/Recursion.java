package main;

public class Recursion {
    static void countDown(int number) {
        if (number <= 0) {
            return;
        }
        System.out.println(number);
        --number;
        countDown(number);
    }

    static int sum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + sum(--number);
    }

    static int fact(int number) {
        if (number == 1)
            return 1;
        return number * fact(--number);
    }

    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        countDown(4);
        System.out.println("------");
        System.out.println(sum(4));
        System.out.println("-----");
        System.out.println(fact(4));
        System.out.println("-----");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + fib(i));
        }
    }
}