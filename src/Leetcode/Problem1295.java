package src.Leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class Problem1295 {
//  -------------------------------------------------------------
    class Solution {
        public int findNumbers(int[] nums) {
            int count =0;
            for(int num : nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
        }
        public static boolean even(int num){
            int count =0;
            while(num>0){
                count++;
                num = num/10;
            }
            if(count%2==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
//    --------------------------------------------------------------------
}
