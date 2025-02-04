package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size : ");
//        int n = sc.nextInt();
//        Initialize an integer array --->
//        int [] arr = new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

//        Initialize a string array --->
//        String [] arr = new String[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.next();
//        }
//        System.out.println(Arrays.toString(arr));

//        Modify
//        arr[2] = "Dhgbjsbvs";
//        System.out.println(Arrays.toString(arr));

//        2-D Arrays --->
//        Initialization ----->
//        int [][] arr = new int [3][3];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length ; j++) {
//                System.out.print(arr[i][j] +" ");
//            }
//            System.out.println();
//        }

//        ArrayList : It is a part of the java collection framework.
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//
//        System.out.println(list.contains(66));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);

//        input
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
//        to get item
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(list.get(i));
//        }

//        MultiDimensional ArrayList:
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}

