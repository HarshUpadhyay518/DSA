package src.PracticeQuestions;

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean check(int n){
        return (n%2==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if (check(n)==true){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
