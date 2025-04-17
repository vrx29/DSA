package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Arrays.fill(arr, -1);
        Scanner scn = new Scanner(System.in);

//        for (int i = 0; i < n; i++) {
//            arr[i] = scn.nextInt();
//        }

        int res = Fib(6, arr);
        System.out.println(res);
    }
    static int count = 0;
    public static int Fib(int n, int[] max) {
        if(max[n] != -1) return max[n];
        if (n == 0) return 0;
        if (n == 1) return 1;
        count++;
        System.out.println(count);
        int res = Fib(n - 1, max) + Fib(n - 2, max);
        max[n] = res;
        return res;
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
