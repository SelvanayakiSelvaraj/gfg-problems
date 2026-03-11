1))Max consecutive ones
You are given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:

Input: nums = [1,1,0,1,1,1]

Output: 3
==========

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int max=0,count=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;
            
        }
        else{
            count=0;
        }
        if(count>max){
            max=count;
        }
     }
     return max;   
    }
}

**********************************************************************************************************************************************************

2))Length of the last word

You are given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Note: A substring is a contiguous non-empty sequence of characters within a string.

Example 1:

Input: s = "Hello World"

Output: 5


class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        int n=s.length()-1;
        while(n>=0&&s.charAt(n)==' '){
            n--;
        }
        while(n>=0&&s.charAt(n)!=' '){
            n--;
            length++;
        }
        return length;
    }
}
******************************************************************************************************************************************************************


   3))Append Characters to String to Make Subsequence


class Solution {
    public int appendCharacters(String s, String t) {
        char[] c=s.toCharArray();
        char []ch=t.toCharArray();
        int i=0,j=0;
        while(i<c.length&&j<ch.length)
         {
                if(c[i]==ch[j]){
                i++;
                j++;
                }
                else{
                    i++;
                }
            }
            return ch.length-j;
        }

}
