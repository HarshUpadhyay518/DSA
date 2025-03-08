package src.BinarySearchAlgorithm.Questions;

//  Find the position of an element in a sorted array in infinite series.
public class InfiniteSeries {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,150,170,};
        int target = 100;
        System.out.println(ans(arr,target));
    }

    static int ans(int[]arr,int target){
//        first find the range
//        first start with a box of 2
        int start = 0;
        int end = 1;

//        condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
//            double the box value
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] nums, int target, int start,int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                return mid;
            }
        }
        return -1;
    }
}
