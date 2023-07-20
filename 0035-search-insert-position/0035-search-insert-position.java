class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length;
        while(l<r)
        {
            int m=(l+r)/2;
            if(nums[m]<target)
            {
                l=m+1;
            }
            else
            {
                r=m;
            }
        }
        return l;
        
    }
}