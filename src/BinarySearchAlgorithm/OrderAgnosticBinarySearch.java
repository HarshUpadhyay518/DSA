package src.BinarySearchAlgorithm;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,20,36,48};
        int target = 4  ;
        int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);
    }

    public static int orderAgnosticBinarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;

//        find whether the arrasy is sorted in ascending or descending order.
        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return mid;
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
            else {
                if(target>arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
