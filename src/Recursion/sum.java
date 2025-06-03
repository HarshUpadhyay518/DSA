package src.Recursion;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int ans = sumFunc(n);
        System.out.println(ans);
    }

    private static int sumFunc(int n) {
        if(n==1){
            return 1;
        }
        return n + sumFunc(n-1);
    }
}
