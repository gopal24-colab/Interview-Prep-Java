/**
 *! Question 
    Given an integer array nums, move all 0's to the end of it 
    while maintaining the relative order of the non-zero elements.
    Note that you must do this in-place without making a copy of the array.

    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]

    Example 2:

    Input: nums = [0]
    Output: [0]

 * 
 */


package Arrays;

import java.util.Arrays;

/**
 * MoveZeroes
 */

class Solution {
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int start = 0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                swap(nums,start++,i);
            }
        }
    }
}
public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0,0,1,2,3,5,1,2,3,5,5,0,0};
        Solution.moveZeroes(arr);
        System.out.println("Move all zeros to the end "+Arrays.toString(arr));
    }
}