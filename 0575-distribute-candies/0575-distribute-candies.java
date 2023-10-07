class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int a=candyType[0];
        int count=1;
        int len=candyType.length;
        int out;
        for(int i=1;i<len;i++)
        {
            if(candyType[i]!=a)
            {
                count++;
                a=candyType[i];
            }
        }
        out=Math.min(count,(len/2));
        return out;
        
    }
}