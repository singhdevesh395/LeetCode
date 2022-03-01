class Solution {
public:
    bool isPalindrome(string s) {
        int n = s.length(), n2;
        
        string ans = "";
        int i;
        
        for(i = 0; i < n; i++)
            if(iswalnum(s[i]))
                ans += tolower(s[i]);
        
        n2 = ans.length();
        
        for(i = 0; i < n2; i++) {
            if(ans[i] != ans[n2-1-i])
                return false;
            if(i >= n2/2)
                break;
        }
        
        return true;
            
    }
};