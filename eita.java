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
		int d=0,x=0,y=0,z=0;
		while(t-->0){
		    		    
		int ar[] = new int[4];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<4; i++){
		        d = Integer.parseInt(inputLine[0]);
		        x = Integer.parseInt(inputLine[1]);
		        y = Integer.parseInt(inputLine[2]);
		        z = Integer.parseInt(inputLine[3]);
		        
		    }
		    
		    System.out.println(Math.max(x*7, y*d+ z*(7-d)));
		
		
	
	}
		}
		catch(Exception e) {
		    return;
		}
	}
}
