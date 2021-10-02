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
		        
		    
		    if(a+b<3)
		    System.out.println("1");
		    
		    if(a+b>=3 && a+b<=10)
		    System.out.println("2");
		    
		    if(a+b>=11 && a+b<=60)
		    System.out.println("3");
		    
		    if(a+b>60)
		    System.out.println("4");
		
		
	
	}
		}
		catch(Exception e) {
		    return;
		}
	}
}
