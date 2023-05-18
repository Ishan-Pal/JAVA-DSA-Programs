class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
        {
            return false;
        }
        int temp = x;
        int rev = 0;
        int dig = 0;
        while (x > 0){
            dig = x % 10;
            rev = (rev * 10) + dig;
            x = (int)(x / 10);
        }
        if(rev == temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
  
}