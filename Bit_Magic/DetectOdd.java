
/**
 * Problem statement
    You are given an array of ‘N’ non-negative integers where all elements 
    appear an even number of times except two, print the two odd occurring 
    elements in increasing order. It may be assumed that the size of the array 
    is at-least two and there will always be exactly two numbers which appear 
    an odd number of times in the given array.


    EXAMPLE:
    Input: 'N' = 6, 'NUMS' = [1, 1, 2, 3, 4, 4]
    Output: 2 3

    Here in the given array we can see that 2 and 3 occur 1 time 
    which is an odd number. Hence, the output will be 2 and 3.
 * 
 */


 /*
  * 
  Approaches
    01Approach :

    The idea of this approach is to use two nested loops. 
    The outer loop traverses through all elements. 
    The inner loop counts occurrences of the current element. 
    We print the elements whose counts of occurrences are odd. 

Algorithm :  

    Initialize the variables ‘firstNumber = -1’ and ‘secondNumber = -1’.
    Iterate over the given array (say iterator ‘i’)
    Initialize a variable ‘count = 0’.
    Iterate over the given array (say iterator ‘j’)
    If NUM[i] is equal to NUM[j]
    count += 1.
    If ‘count’ is odd
    If ‘firstNumber’ is -1
    Set ‘firstNumber’ to NUM[i].
    Else
    Set ‘secondNumber’ to NUM[i].
    If ‘firstNumber’ is not equal to min ( ‘firstNumber’, ‘secondNumber’ )
    swap( ‘firstNumber’, ‘secondNumber’ ).
    Return { ‘firstNumber’, ‘secondNumber’ }.


    02Approach:

    The idea of this approach is to use Hashmap to count the number 
    of occurrences of each number. Put each number and its current 
    frequency in a hashmap where the first pair is the number itself 
    and second is the current frequency. After putting each element of 
    the array into a hashmap we iterate over it and check whose element is having odd frequency.

    Algorithm :  

    Initialize the variables ‘firstNumber = -1’ and ‘secondNumber = -1’.
    Declare an unordered_map<int,int> freq to store frequency of each element.
    Iterate over the given array (say iterator ‘i’)
    freq[ NUM[i] ] += 1.
    Iterate over the ‘freq’
    If frequency of element is odd
    If ‘firstNumber’ is -1
    Set ‘firstNumber’ to NUM[i].
    Else
    Set ‘secondNumber’ to NUM[i].
    If ‘firstNumber’ is not equal to min ( ‘firstNumber’, ‘secondNumber’ )
    swap( ‘firstNumber’, ‘secondNumber’ ).
    Return { ‘firstNumber’, ‘secondNumber’ }.


    03Approach :

    As we know for any integer ‘x’, the bitwise xor of ‘x’ and ‘x’ is 0. 
    We know that except two elements all the elements of the array will 
    appear even number of times, which means that the bitwise xor of all 
    the elements which appear even time will be 0. So, we can say that 
    the bitwise xor of the array is equal to the bitwise xor of the two odd occurring elements. 

    Now we have the bitwise xor of the two odd occurring elements. 
    We know that these two elements are not equal which means that 
    their xor must have at least one bit set, so we find that bit 
    and partition our given array into two groups. First group has 
    this bit set and the other group will have this bit unset now 
    we will separately xor the groups. The xor of each group is 
    the odd occurring element. Hence we find the two odd occurring elements.


    Algorithm : 

    Initialize the variables ‘xorOfArray = 0’ ‘firstNumber = -1’ and ‘secondNumber = -1’.
    Iterate over the given array (say iterator ‘i’)
    ‘xorOfArray’ ^= NUMS[i].
    ‘setBit’ = (~(‘xorOfArray - 1’)) & (‘xorOfArray’).
    Iterate over the given array (say iterator ‘i’)
    if ‘setBit’ & NUMS[i]
    ‘firstNumber’ ^= NUMS[i].
    else
    ‘secondNumber’ ^= NUMS[i].
    If ‘firstNumber’ is not equal to min ( ‘firstNumber’, ‘secondNumber’ )
    swap( ‘firstNumber’, ‘secondNumber’ ).
    Return { ‘firstNumber’, ‘secondNumber’ }.

  */

package Bit_Magic;

/**
 * DetectOdd
 */
public class DetectOdd  {

    public static void main(String[] args) {
        
    }
}