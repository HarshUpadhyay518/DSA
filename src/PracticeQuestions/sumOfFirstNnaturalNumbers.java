package src.PracticeQuestions;

import java.util.Scanner;

public class sumOfFirstNnaturalNumbers {
    public static int findSum(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }
}
