package src.Recursion;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }

    private static void func(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
    }
}
