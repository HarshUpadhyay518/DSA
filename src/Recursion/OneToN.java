package src.Recursion;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }

    private static void func(int n) {
        if(n==0){
            return;
        }
        func(n-1);
        System.out.println(n);
    }
}
