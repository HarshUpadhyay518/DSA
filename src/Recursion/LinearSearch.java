package src.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 1;
        System.out.println(search(arr,target,0));
    }
    public static boolean search(int[]arr,int target,int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,target,index+1);
    }
}
