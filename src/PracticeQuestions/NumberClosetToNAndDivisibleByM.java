package src.PracticeQuestions;

import java.util.Scanner;

public class NumberClosetToNAndDivisibleByM {
    public static int closestNumber(int n,int m){
//        first find the quotient
        int q = n/m;
//        first possiblke closest number
        int n1 = n*m;
//        Second possible closest number
        int n2 = n*m>0 ? (m*(q+1)) : (m*(q-1));
//        check which is the smallest
        if(Math.abs(n-n1)<Math.abs(n-n2)){
            return n1;
        }else {
            return n2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(closestNumber(n,m));
    }
}
