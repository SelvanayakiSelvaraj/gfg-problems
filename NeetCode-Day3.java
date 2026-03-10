1))Valid Anagram



        class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length()!=t.length())
return false;
char[] ch=s.toCharArray();
char[]c=t.toCharArray();
Arrays.sort(ch);
Arrays.sort(c);
return Arrays.equals(ch,c);
    }
}

****************************************************************************************************************************************************


2))Replace Elements With Greatest Element On Right Side
 
You are given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
   After doing so, return the array.

  class Solution {
    public int[] replaceElements(int[] arr) {
      
      for(int i=0;i<arr.length-1;i++){
        int lar=-1;
        for(int j=i+1;j<arr.length;j++){
           if(arr[j]>lar){
            lar=arr[j];
           }
           arr[i]=lar;
        }
      }
      arr[arr.length-1]=-1;
      return arr; 
    }
}


********************************************************************************************************************************************************

3))  Is Subsequence

You are given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "node", t = "neetcode"


   class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){

            if(s.charAt(i) == t.charAt(j)){
                i++;
            }

            j++;
        }

        if(i == s.length())
            return true;
        else
            return false;
    }
}

Output: true
