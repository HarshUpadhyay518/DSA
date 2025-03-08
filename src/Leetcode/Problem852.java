//package src.Leetcode;
//
////https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
///**
// * // This is MountainArray's API interface.
// * // You should not implement it, or speculate about its implementation
// * interface MountainArray {
// *     public int get(int index) {}
// *     public int length() {}
// * }
// */
//
//class Solution {
//    public int binarySearch(MountainArray mountainArr , int target , boolean asc , int top){
//        if(asc){
//            int start = 0;
//            int end = top;
//
//            while(start<=end){
//                int mid = start + (end - start)/2;
//
//                if(mountainArr.get(mid)==target) return mid;
//                else if(target > mountainArr.get(mid)) start = mid +1;
//                else end = mid-1;
//            }
//        }
//        else{
//            int start = top+1;
//            int end = mountainArr.length() -1;
//
//            while(start<=end){
//                int mid = start + (end - start)/2;
//
//                if(mountainArr.get(mid)==target) return mid;
//                else if(target > mountainArr.get(mid)) end = mid-1;
//                else start = mid+1;
//            }
//        }
//        return -1;
//    }
//
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int start = 0;
//        int end = mountainArr.length() -1;
//        // get top of mountain
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(mountainArr.get(mid+1) > mountainArr.get(mid)) start = mid+1;
//            else end = mid-1;
//        }
//
//        int top = start;
//
//        int x = binarySearch(mountainArr,target,true,top);
//        int y = binarySearch(mountainArr,target,false,top);
//
//        if(x==-1) return y;
//        else if(y==-1) return x;
//        else return Math.min(x,y);
//
//    }
//}