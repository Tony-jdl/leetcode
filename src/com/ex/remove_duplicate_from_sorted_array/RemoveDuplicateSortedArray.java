package com.ex.remove_duplicate_from_sorted_array;

public class RemoveDuplicateSortedArray {
    public int removeDuplicateSortedArray(int[] nums) {
        int prec = 0;
        int remainNums = nums.length;
        
        for ( int i = 1; i < nums.length - 1; i++) {
            if (nums[prec] == nums[i]) {
                remainNums--;
                for(int j = i; j < nums.length; j++){
                    if (j+1 < nums.length) {
                        int tmp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = tmp;
                    }
                }
            }
            prec++;
        }
        return remainNums;
    }
}
