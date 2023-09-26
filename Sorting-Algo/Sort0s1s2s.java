import java.util.*;

/**
 * @dev Duch National Flag Algorithm
 */

public class Sort0s1s2s {
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort0s1s2s(int[] arr,int n){
        int left = 0;
        int right = n-1;
        int i = 0;
        while(i <= right){
            if(arr[i] == 0){
                swap(arr,i++,left++);
            }
            else if(arr[i] == 2){
                swap(arr, i, right--);
            }
            else i++;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,0,1,2,0,1,1,2,0,1,1};
        sort0s1s2s(arr,arr.length); // sort the array
        System.out.println(Arrays.toString(arr));
    }
}
