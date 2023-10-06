class Solution {
    public String reverseWords(String s) {
        s=' '+s;
        int len=s.length();
        int j=len-1;
        boolean word=true;
        boolean check=true;
     
        String str="";
        for(int i=len-1;i>=0;i--)
        {
            if(s.charAt(i)==' ' && word)
            {
                str=str+s.substring(i+1,j+1)+' ';
                j=i;
                word=false;
                check=true;
            }
            else if(s.charAt(i)!=' ')
            {
                word=true;
                if(i!=0 && check)
                {
                    j=i;
                    check=false;
                }
            }

        }
        str=str.trim();
        return str;
        
    }
}