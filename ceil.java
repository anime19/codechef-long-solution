/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
		try {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		        int a = Integer.parseInt(inputLine[0]);
		        int b = Integer.parseInt(inputLine[1]);
		        
		       int min= a<b?a:b;
		       int max=a>b?a:b;
		       
		       int m=Integer.MIN_VALUE;
		       int op=0,x=0;
		       
		      
		       if(a==b)
		       System.out.println(0);
		       
		       else {
		           
		            int l=min, r=max, mid=0;
		       while(l<=r){
		           
		           mid=(l+r)/2;
		           
		           Double d= new Double(b-mid);
		           Double e= new Double(mid-a);
		           
		          op=(int)Math.ceil(d/2) + (int)Math.ceil(e/2);
		          
		          if(op>m) {
		          m=op;
		          r=mid;
		          }
		          
		          else 
		          l=mid+1;
		           
		       }
		       
		       System.out.println(m); 
		           
		       }
		       
		      // else{
		      //      int l=max, r=min, mid=0;
		      // while(l>=r){
		           
		      //     mid=(l+r)/2;
		           
		      //     Double d= new Double(b-mid);
		      //     Double e= new Double(mid-a);
		           
		      //    op=(int)Math.ceil(d/2) + (int)Math.ceil(e/2);
		          
		      //    if(op>m) {
		      //    m=op;
		      //    r=mid+1;
		      //    }
		          
		      //    else 
		      //    l=mid;
		           
		      // }
		       
		      // System.out.println(m); 
		           
		           
		      // }
		        
		    }
		    
		
		
	
	}
	
		catch(Exception e) {
		    return;
		}
	}
}
