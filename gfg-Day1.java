1)IndexesOfSubarraySum

  
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int j=0;
        int sum =0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            sum += arr[i];
            
            while(sum > target && j < i){
                sum -= arr[j];
                j++;
            }
            
            if(sum == target){
                res.add(j+1);
                res.add(i+1);
                return res;
            }
        }
        res.add(-1);
        return res;
    }
}
_________________________________________________________________________________________________________________________________________________________

2)MissingInArray

  class Solution {
    int missingNum(int arr[]) {
        long n=arr.length+1;
        long sum=0;
        long num=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (int)( num-sum);
    }
}
_________________________________________________________________________________________________________________________________________________________

3)SecondLargest

  class Solution {
    public int getSecondLargest(int[] arr) {
         int lar=-1;
         int sec=-1;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>lar){
                 sec=lar;
                 lar=arr[i];
             }
             else if(arr[i]>sec&&arr[i]!=lar){
                 sec=arr[i];
                    
             }
         }
         return sec;
    }
}
  _________________________________________________________________________________________________________________________________________________________

