package src.LinearSearchAlgorithm;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String name = sc.next();
        System.out.println("Enter the character you want to check : ");
        char target = sc.next().charAt(0);
//        String name = "Harsh";
//        char target = 'r';
        System.out.println(search(name,target));
    }

    public static boolean search(String name, char target) {
        if (name.length() == 0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
