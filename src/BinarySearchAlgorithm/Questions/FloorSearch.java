package src.BinarySearchAlgorithm.Questions;

//Floor --> Greatest element in an array smaller and equal to target.
public class FloorSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int n = arr.length-1;
        int target = 15;
        int index = fS(arr,n-1,target);
        System.out.println(index);
    }

    static int fS(int[]arr,int n,int target){
        if(target>=arr[n-1]) return n-1;

        if(target < arr[0]) return -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] > target){
                return (i-1);
            }
        }
        return -1;
    }
}
