package src.PracticeQuestions;

import java.util.Scanner;

public class diceProblem {
    public static void findOppositeFace(int n){
        int ans = 7-n;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findOppositeFace(n);
    }
}
