// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
   public static ArrayList<Integer> duplicates(int arr[], int n) {
       ArrayList<Integer> a=new ArrayList<>();
       int[] ar=new int[n];
       Arrays.fill(ar,0);
       for(int i=0;i<arr.length;i++){
           ar[arr[i]]++;
       }
      for(int i=0;i<n;i++){
          if(ar[i]>1){
              a.add(i);
          }
      }
      if(a.size()==0){
          a.add(-1);
      }
      return a;
       
   }
}