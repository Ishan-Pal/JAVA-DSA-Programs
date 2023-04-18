class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder word3=new StringBuilder();
        for(int i=0;i<word1.length()||i<word2.length();i++)
        {
            if(i<word1.length())
            {
                word3.append(word1.charAt(i));
            }
            if(i<word2.length())
            {
                word3.append(word2.charAt(i));
            }
         }
        return word3.toString();
        
    }
}