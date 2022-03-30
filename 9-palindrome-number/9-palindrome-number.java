class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reverce=0;
        while (x>0){
            int digits=x%10;
            reverce = reverce*10+digits;
            x= x/10;
        }
        if((original==reverce)){
            return true;
        }
        return false; 
    }
}