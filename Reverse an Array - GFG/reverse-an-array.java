/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   for(int i =1 ; i<=n ; i++)
 {
     int t=sc.nextInt();
     
     int arr [] = new int[t];
     
     for (int initial=0 ; initial <t; initial++)
     {
        arr[initial]= sc.nextInt();
       
     }
      for(int last =arr.length -1 ; last >=0;last--)
     {
         System.out.print(arr[last]+ " ");
         
     }
     
      System.out.println("");
 }
		
		
	}
}