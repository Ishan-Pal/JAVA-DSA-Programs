class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        s=" "+s;
        int i=s.lastIndexOf(" ");
        String w=s.substring(i,s.length());
        w=w.trim();
        int l=w.length();
        return l;
    }
}