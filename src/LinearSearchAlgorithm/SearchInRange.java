package src.LinearSearchAlgorithm;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the starting index : ");
        int start = sc.nextInt();
        System.out.println("Enter the end index : ");
        int end = sc.nextInt();
        System.out.println("Enter the value you want to check : ");
        int target = sc.nextInt();

        int ans = search(arr,start,end,target);
        System.out.println(ans);
    }

    public static int search(int[] arr,int start, int end, int target) {
        if(arr.length == 0) return -1;
        for (int i = start; i <= end ; i++) {
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
