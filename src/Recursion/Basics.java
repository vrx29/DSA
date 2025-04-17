package Recursion;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        print(1);
    }

    static void print(int n){
        if(n == 5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
