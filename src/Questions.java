//package src;
//
//import java.util.Arrays;
//import java.util.Scanner;


//public class Questions {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }

//        swap(arr,0,4);
//        System.out.println(max(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    Swap indexes ---->
//    public static void swap(int[]arr,int index1,int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }

//    Maximum items --->
//    public static int max(int[]arr){
//        int maxVal = arr[0];
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i]>maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }

//    Reverse an array --->
//    public static void reverse(int[]arr){
//        int start = 0;
//        int end = arr.length-1;
//        while(start<end){
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
//    }
//}
