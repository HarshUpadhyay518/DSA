package src.BinarySearchAlgorithm.Questions;

// Ceiling --> Smallest element in an array greater or equal to target.
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int start = 0;
        int end = arr.length-1;
        int index = ceilSearch(arr,start,end,target);
        System.out.println(index);
    }

    private static int ceilSearch(int[] arr, int start, int end, int target) {
        if(arr.length == 0) return -1;
        if(target <= arr[start]) return start;
        for (int i = start; i < end; i++) {
            if(arr[i] == target) return i;
            if(arr[i] < target && arr[i+1] >= target){
                return i+1;
            }
        }
        return -1;
    }
}
