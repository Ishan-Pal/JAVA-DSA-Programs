class Solution {
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int option1 = nums[0] * nums[1] * nums[nums.length - 1];
        int option2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        return Math.max(option1, option2);
    }
}