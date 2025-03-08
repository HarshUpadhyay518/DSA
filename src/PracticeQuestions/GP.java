package src.PracticeQuestions;

import java.util.Scanner;

// Program to find nth term of given GP
public class GP {
    public static int find(int a,int r,int n){
        return (a*(int)(Math.pow(r,n-1)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       // Starting Number
        int r= sc.nextInt();        // Common Ratio
        int n = sc.nextInt();       // Nth term to be find

        System.out.println(find(a,r,n));
    }
}
