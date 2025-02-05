package src.LinearSearchAlgorithm;

import java.util.Scanner;

//  Search in the array : return index if item found
// Otherwise return -1.

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value you want to check : ");
        int target = sc.nextInt();

        int ans = linearSearch(arr,target);
        System.out.println("Element at index : " + ans);
    }

    public static int  linearSearch(int[] arr, int target) {
        if(arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
