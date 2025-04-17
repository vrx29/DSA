package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if (n < 2) return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
