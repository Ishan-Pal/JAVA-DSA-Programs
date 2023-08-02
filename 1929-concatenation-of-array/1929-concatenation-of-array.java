class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int len=nums.length;
        int j=0;
        while(j<2)
        {
          for(int i=0;i<len;i++)
          {
            arr.add(nums[i]);
          }
            j++;
        }
        int[]arr2=new int[2*len];
        
        for(int i=0;i<2*len;i++)
        {
            arr2[i]=arr.get(i);
        }
        return arr2;
        
    }
}