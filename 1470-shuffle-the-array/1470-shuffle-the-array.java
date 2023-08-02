class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int l=0;
        int h=n;
        int i=0;
        int[]arr=new int[len];
        while(i<len)
        {
            if(i%2==1)
            {
                arr[i]=nums[h];
                h++;
            }
            else
            {
                arr[i]=nums[l];
                l++;
            }
            i++;
        }
        return arr;
        
        
    }
}