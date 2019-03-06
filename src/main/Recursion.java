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

    public static void main(String[] args) {
        countDown(4);
        System.out.println("------");
        System.out.println(sum(4));
    }
}
