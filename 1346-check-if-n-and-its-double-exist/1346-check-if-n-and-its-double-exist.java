class Solution {
    public boolean checkIfExist(int[] arr) {
        int length=arr.length;
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==2*arr[j])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
        
        
        
    }
}