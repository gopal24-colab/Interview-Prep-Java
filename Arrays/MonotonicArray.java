/*

 * Check the array is Monotomic Array or  ?
 * 
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
 * An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
 * Given an integer array nums, return true if the given array is monotonic, or false otherwise.
 * Example 1:
 * 
 * Input: nums = [1,2,2,3]
 * Output: true
 * Example 2:
 * 
 * Input: nums = [6,5,4,4]
 * Output: true
 * Example 3:
 * 
 * Input: nums = [1,3,2]
 * Output: false
 * 
 * 
 */

 package Arrays;
 
 /**
  * MonotonicArray
  */
 public class MonotonicArray {
 
    private static boolean isMonotonicArray(int[] arr) {
        boolean isIncresing = false;
        boolean isDecreasing = false;

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                if(arr[i] < arr[i+1]) {
                    isDecreasing = true;
                }
                if(arr[i] > arr[i+1]) {
                    isIncresing = true;
                }
            }
            if(isIncresing && isDecreasing){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println(isMonotonicArray(arr));
    }
 }