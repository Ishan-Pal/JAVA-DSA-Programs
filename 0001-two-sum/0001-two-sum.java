class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=nums.length;
         int[]arr=new int[2];
        for(int j=0;j<l;j++)
        {
            for(int k=j+1;k<l;k++)
            {
                if(nums[j]+nums[k]==target)
                {
                    int l1=j;
                    int l2=k;
                    arr[0]=l1;
                    arr[1]=l2;
                    // return arr2;
                }

            }
        }
        return arr;
    }
}