package com.ex.longest_common_prefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        String prefix = Arrays.stream(strs).reduce((s1, s2) -> {
            int i=0;
            while(i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)){
                i++;
            }
            return s1.substring(0, i);
        }).orElse("");

        //return prefix;

        String prefix2 = Arrays.stream(strs).reduce((s1, s2) -> {
            int i=0;
            while(i<s1.length() && i<s2.length() && s1.charAt(i) == s2.charAt(i)){
                i++;
            }
            return s1.substring(0, i);
        }).orElse("");

        return prefix + prefix2;
    }

    /*
        Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".



        Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""

        Explanation: There is no common prefix among the input strings.


        Constraints:
        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters.
    */
}
