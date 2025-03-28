package src.Leetcode;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class problem448 {
//    class Solution {
//        public List<Integer> findDisappearedNumbers(int[] arr) {
//            int i = 0;
//            while(i < arr.length){
//                int correct = arr[i]-1;
//                if (arr[i] != arr[correct]){
//                    swap(arr,i,correct);
//                }
//                else {
//                    i++;
//                }
//            }
//            List<Integer> ans = new ArrayList<>();
//            for(int j =0;j<arr.length;j++){
//                if(arr[j]!= j+1){
//                    ans.add(j+1);
//                }
//            }
//            return ans;
//        }
//        static void swap(int[] arr,int i,int correct){
//            int temp = arr[i];
//            arr[i] = arr[correct];
//            arr[correct] = temp;
//        }
//    }
}
