package src.PracticeQuestions;

// Finfd gthe nth term of an AP from first two numbers

import java.util.Scanner;

public class AP {
    public static int find(int a1,int a2,int n){
        return a1+(n-1)*(a2-a1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(find(a1,a2,n));
    }
}
