class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int out=-1;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==target)
            {
                out=i;
            }     
        }
        return out;
        
    }
}