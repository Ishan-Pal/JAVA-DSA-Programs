class Solution {
    public int majorityElement(int[] nums) {
        int h=nums.length/2;
        
        for(int i=0;i<nums.length;i++)
            {   int c = 0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        c++;
                    }
                }
              if(c>h)
              {
                  return nums[i];
              }
            }
        return 0;
        
    }
}