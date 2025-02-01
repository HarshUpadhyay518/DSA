package src;

import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        CAlCULATOR :
        int ans = 0;
        while (true){
//            take the operator as an input
            System.out.println("Enter the operator : ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op =='/' || op=='%'){
//                input two numbers
                System.out.println("Enter the numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    ans = num1+num2;
                }
                if (op == '-'){
                    ans = num1-num2;
                }
                if (op == '*'){
                    ans = num1*num2;
                }
                if (op == '/'){
                    if(num2!=0){
                        ans = num1/num2;
                    }
                }
                if (op == '%'){
                    ans = num1%num2;
                }
            } else if (op == 'x' || op =='X') {
                break;
            }else {
                System.out.println("Invalid Operation");
            }
        }
        System.out.println(ans);

//        Reverse a number :
//        int ans = 0;
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//        while(n>0){
//            int rem = n%10;
//            ans = ans*10 + rem;
//            n = n/10;
//        }
//        System.out.println(ans);

//        Print the occurrence of a digit in a number :
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//        System.out.println("Enter the digit to be checked : ");
//        int digit = sc.nextInt();
//        int count = 0;
//        while(n>0){
//            int rem = n % 10;
//            if(rem == digit){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);

//        Print numbers 1 to 5.  =============>>>>>>>>
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }
//        int salary = sc.nextInt();
//        if (salary > 10000){
//            salary += 1000;
//        }
//        else{
//            salary += 2000;
//        }
//        System.out.println(salary);
    }
}
