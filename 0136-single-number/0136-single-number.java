class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!arr.contains(nums[i]))
            {
                arr.add(nums[i]);
            }
            else
            {
                arr.remove(nums[i]);
            }
        }
        return (int)arr.iterator().next();
        
        
    }
}