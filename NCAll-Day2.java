1))Score of a String
  You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.


       class Solution {
    public int scoreOfString(String s) {
        int []res=new int[s.length()];
        int ind=0,total=0;
        for(char ch:s.toCharArray()){
            int asci=(int)ch;
            res[ind]=asci;
            ind++;
        }
        for(int j=1;j<res.length;j++){
            total+=Math.abs(res[j]-res[j-1]);
        }
        return total;
    }
}
********************************************************************************************************************************************************************************************
2))Concatenation of Array
You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).


class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
     int []ans=new int[2*n];
     for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
        ans[i+n]=nums[i];
     } 
     return ans;  
    }
}
*************************************************************************************************************************************************************************************************

  3))Contains Duplicate
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.




  class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int v=0;v<nums.length;v++){
            for(int i=0;i<nums.length;i++){
                if(nums[v]==nums[i]&&v!=i)
                   return true;
            }
        }
        return false;
    }
}
*************************************************************************************************************************************************************************************************
