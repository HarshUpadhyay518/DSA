package src.Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(func(n));
    }

    private static int func(int n) {
        if(n == 1){
            return n;
        }
        return n*func(n-1);
    }
}
