class Solution {
    public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    ans = new int[2*n];
    ans = nums;
    for(int i=0;i<n;i++)
    {
    if(ans[i]==nums[i])
    {
     ans[i+n]=num[i];
    }
    }
    return ans;
    

        
    }
}