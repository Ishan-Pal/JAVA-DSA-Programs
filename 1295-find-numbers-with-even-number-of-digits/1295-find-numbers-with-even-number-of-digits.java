class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            String str=Integer.toString(nums[i]);
            int len=str.length();
            if(len%2==0)
            {
                c++;
            }
        }
        return c;
        
    }
}