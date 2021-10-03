import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static long mod = 1000000007;
    
    static long func(long x){
        
        long p=x;
        x=x/10;
        
        while(x!=0){
        long r=x%10;
        p=10*p+r;
        x/=10;
        
        }
        return p;
    }
    
    static long pow(long a, long b){
        
        if(a==0)
        return 0;
        if(b==0)
        return 0;
        
        long tmep=1;
        while(b>0){
            if(b%2 !=0){
            tmep=((tmep%mod)*(a%mod))%mod;
            
            }
            b=b>>1;
                 
            a=((a%mod)*(a%mod))%mod;
        }
        return tmep;
        
        
    }
    
	public static void main (String[] args) throws IOException
	{
		try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine().trim());
		
		 long x[]=new long[100001];
		 long y[]=new long[100001];
		    
		    x[0]=0;
		    x[1]=1;
		    for(int i=2;i<=100000;i++){
		        if(i<10)
		        x[i]=i;
		        else
		        x[i]=func(i);
		        
		        y[i]=y[i-1]+x[i];
		    }
		    
		    
		while(t-->0){
		    
	
		    		    
		long l=0,r=0;
		
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<2; i++){
		        l= Long.parseLong(inputLine[0]);
		        r = Long.parseLong(inputLine[1]);
		    }
		    
		System.out.println(pow(x[(int)l],y[(int)r]-y[(int)l]));

	}
	
		}
		catch(Exception e) {
		    return;
		}
	}
}
