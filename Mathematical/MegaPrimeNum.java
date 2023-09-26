package Mathematical;

import java.util.Scanner;

/**
 * @Question 
 * Given two integers ‘Left’ and ‘Right’.
 *  Your task is to find the total count of 
 * ‘megaprime’ numbers from the range ‘Left’ to ‘Right’. 
 * A ‘megaprime’ number is a prime number and its 
 * individual digits are also prime.
 *
 * For example, ‘53’ is a ‘megaprime’ 
 * number because ‘53’ is a prime number and 
 * its individual digits,‘3’ and ‘5’, are also prime. 
 * ‘13’ is not a ‘megaprime’ number because out of its 
 * individual digits (1, 3), ‘1’ is not prime.
 * 
 */

class Solution {
    private static boolean isMagaPrime(int n){
        if(n == 0 || n == 1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i == 0)    return false;
        }

        boolean[] primeNums = {false,false,true,true,false,true,false,true,false,false};

        while(n>0){
            int rem = n%10;
            if(rem == 1) return false;
            else if(rem != 2 && !primeNums[rem]) return false;
            n /= 10;
        }

        return true;
    }
    public static int countMegaPrimeNumbers(int left,int right){
        int count = 0;
        for(int i=left; i<=right; i++){
            if(isMagaPrime(i)){
                count++;
            }
        }
        return count;
    }
}

public class MegaPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int countMegaPrime = Solution.countMegaPrimeNumbers(n1, n2);
        System.out.println("Count Mega Prime Number is " + countMegaPrime);
        sc.close();
    }
}
