package com.ex.palindrome_number;

public class Palindrome {
    public void main(String[] args) {

    }
    public static boolean isPalidrome(int x){
        String nums = Integer.toString(x);
        int j = nums.length()-1;
        for(int i = 0; i<nums.length()/2; i++){
            if(nums.charAt(i) != nums.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.

    Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.

    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

    Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


    Constraints:

    -231 <= x <= 231 - 1


    Follow up: Could you solve it without converting the integer to a string?
*/
}
