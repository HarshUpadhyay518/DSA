package src.PracticeQuestions;

import java.util.Scanner;

public class sumOfGeometricSeries {
    public static int findSum(int a,int r,int n){
        return (a*(1-(int)(Math.pow(r,n))))/(1-r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(findSum(a,r,n));
    }
}
