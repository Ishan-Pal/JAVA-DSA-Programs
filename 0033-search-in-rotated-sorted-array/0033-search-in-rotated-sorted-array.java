class Solution {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int ou=-1;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==target)
            {
                ou=i;
            }     
        }
        return ou;
        
    }
}