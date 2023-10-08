class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        else
        {
            char[]s1=s.toCharArray();
            char[]t1=t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
            if(new String(s1).equals(new String(t1)))
            {
                return true;
            }
            else
                return false;
            
        }
        
    }
}