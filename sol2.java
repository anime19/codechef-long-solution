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
		    
		        int e = Integer.parseInt(inputLine[0]);
		        int k = Integer.parseInt(inputLine[1]);
		        
		        int l=1;
		        
		    while(e>0){
		        e=(int)(Math.floor(e/k));
		        
		       l++;
		    }
		    
		    System.out.println(l-1);
		        
		    }
		    
		
		
	
	}
	
		catch(Exception e) {
		    return;
		}
	}
}
