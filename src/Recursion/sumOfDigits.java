package src.Recursion;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }

    private static int func(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + func(n/10);
    }

}
