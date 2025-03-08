package src.PracticeQuestions;

import java.util.Scanner;

public class swapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //    Naive Approach : using third variable
//        int temp = a;
//        a=b;
//        b=temp;

//        Using Bitwise Operator
//        a = a^b;
//        b = a^b;
//        a = a^b;

//        Using Arithmetic Operators
//        a=a+b;
//        b=a-b;
//        a=a-b;

        System.out.println(a+" "+b);

    }
}
