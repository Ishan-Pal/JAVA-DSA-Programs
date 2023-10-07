class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int maxtillnow=Integer.MIN_VALUE;
        int maxend=0;
        for(int i=0;i<len;i++)
        {
            maxend+=nums[i];
            if(maxtillnow<maxend)
            {
                maxtillnow=maxend;
            }
            if(maxend<0)
            {
                maxend=0;
            }
        }
        return maxtillnow;
        
    }
}