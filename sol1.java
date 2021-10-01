/* package codechef; // don't place package name! */
/* olyrank */

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
		    		    
		int ar[] = new int[6];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<6; i++){
		        ar[i] = Integer.parseInt(inputLine[i]);
		        
		    }
		    
		    if(ar[0]+ar[1]+ar[2]>ar[3]+ar[4]+ar[5])
		    System.out.println("1");
		    else
		    System.out.println("2");
		
		
	
	}
		}
		catch(Exception e) {
		    return;
		}
	}
}
