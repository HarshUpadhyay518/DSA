package src.PracticeQuestions;

import java.util.Scanner;

public class simpleInterest {
    public static int findInterest(float p,float r,float t){
        return (int) ((p*r*t)/100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();

        System.out.println(findInterest(p,r,t));
    }
}
