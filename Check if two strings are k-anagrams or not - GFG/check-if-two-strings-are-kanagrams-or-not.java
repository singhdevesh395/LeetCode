// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}// } Driver Code Ends


//User function template for JAVA

class Solution {
   boolean areKAnagrams(String s1, String s2, int k) {
       if(s1.length() != s2.length()) return false;
       Map<Character,Integer> hm = new HashMap<>();
       for(char ch:s1.toCharArray()) {
           if(hm.containsKey(ch)) hm.put(ch, hm.get(ch)+1);
           else hm.put(ch,1);
       }
       int uniq = 0;
       for(char ch:s2.toCharArray()){
           if(hm.containsKey(ch)) {
               hm.put(ch, hm.get(ch)-1);
           } else uniq++;
       }
       int count = 0;
       for(Integer it:hm.values()){
           if(it < 0) {
               uniq += Math.abs(it);
           }
           else count += it;
       }
       if(count > k && uniq > k) return false;
       return true;
   }
}