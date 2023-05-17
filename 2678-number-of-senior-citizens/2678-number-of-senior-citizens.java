class Solution {
    public int countSeniors(String[] s) {
        int ans=0;
        for(String ss:s){
            int a1=ss.charAt(11)-'0';
            int a2=ss.charAt(12)-'0'; 
            if((a1*10)+a2>60)
                ans++;
        }
        return ans;
        
        
    }
}