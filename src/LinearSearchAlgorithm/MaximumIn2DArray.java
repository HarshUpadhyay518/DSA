package src.LinearSearchAlgorithm;

public class MaximumIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {79,68,34,56}
        };
        System.out.println(max(arr));
    }

    private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int[] i : arr){
            for (int j:i) {
                if(j>max){
                    max = j;
                }
            }
        }
        return max;
    }
}
