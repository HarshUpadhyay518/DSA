package src.PracticeQuestions;

import java.util.Scanner;

public class AreaOfCircle {
    public static double findArea(float r){
        return  (Math.PI*r*r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println(findArea(r));
    }
}
