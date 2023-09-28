/*
Given a sorted array arr[] of distinct integers. 
Sort the array into a wave-like array(In Place).
In other words, arrange the elements into a sequence 
such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
If there are multiple solutions, find the lexicographically smallest one.
Note:The given array is sorted in ascending order, and you don't need to 
return anything to make changes in the original array itself.

input:n = 5arr[] = {1,2,3,4,5}Output: 2 1 4 3 5
Explanation: Array elements after sorting it in wave form are 2 1 4 3 5.

input:n = 6arr[] = {2,4,7,8,9,10}Output: 4 2 8 7 10 9
Explanation: Array elements after sorting it in wave form are 4 2 8 7 10 9.

*/

import java.util.Arrays;

public class WaveArray {
    public static void makeWaveArray(int[] arr,int n){
        for(int i=0; i<n; i+=2){
            swap(arr,i,i+1);
        }
    }
    private static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        makeWaveArray(arr, arr.length);
        System.out.println("wave array is " + Arrays.toString(arr));
    }
}
