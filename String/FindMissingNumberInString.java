/*
 You had a sequence of consecutive nonnegative integers.
 You appended all integers at the end of each other to form a 
 string ‘S’ without any separators. While appending each integer in a string, 
 you forgot to append exactly one integer from the sequence. 
 Now all the integers from a string and you don’t know which integer you have missed.

 Your task is to find the missing number in the string 
 such that it is possible to obtain a sequence of consecutive 
 non-negative integers from the given string. If more than 
 one missing integer is present or all the integers are 
 already present or if the string is not valid then the answer will be -1 for all such cases.

 !Note :- 
    1. The string consists of only digits 0 to 9.
    2. The numbers will have no more than six digits. 
 */


package String;


class Solution {
    public static String findMissingNumber(String str){
        return "_";
    }
}

public class FindMissingNumberInString {
    
    public static void main(String[] args) {
        System.out.println(Solution.findMissingNumber("111314"));        
    }
}
