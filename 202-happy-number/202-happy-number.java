class Solution {
    public boolean isHappy(int n) {
	/*
   --   Only 1 and 7 will end up to 1 in single digit numbers
	--	  letting n reduce to single digit
	  */
     while(n>9)
          n=square(n);
                                     
   return  n==1||n==7;
            
                }
      int  square(int n){
            int sum=0;
            while(n>0){
             sum+=(n%10)*(n%10);
             n/=10;}
     return sum;
  }
    
}