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
		long t = Long.parseLong(br.readLine().trim());
		int g=0,c=0;
		while(t-->0){
		    		    
		int ar[] = new int[2];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<2; i++){
		        g = Integer.parseInt(inputLine[0]);
		        c = Integer.parseInt(inputLine[1]);
		        
		        
		    }
		    
		    System.out.println((c*c)/(2*g));
		
		
	
	}
		}
		catch(Exception e) {
		    return;
		}
	}
}
