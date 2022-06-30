/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int j=0;j<t;j++){
    	    int n = sc.nextInt();
    	    int arr[] = new int[n];
    	    for(int i=0;i<n;i++){
    	        arr[i] = sc.nextInt();
    	    }
    	    int s=0,e=n-1;
    	    while(s<e){
    	        int temp = arr[s];
    	        arr[s] = arr[e];
    	        arr[e] = temp;
    	        s++;
    	        e--;
    	    }
    	    for(int i=0;i<n;i++){
    	       System.out.print(arr[i]+" ");
    	    }
    	     System.out.println();
	    }
	}
}