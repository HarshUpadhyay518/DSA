package src.LinearSearchAlgorithm;

public class MinimunValue {
    public static void main(String[] args) {
        int[] arr = {114,45,6,8,2,9};
        System.out.println(min(arr));
    }
    public static int min(int[]arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
