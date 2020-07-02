/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    
	    while(t-->0){
	        
	        int n = sc.nextInt();
	        int count = 1;
	        int x = 0;
	        
	        if(n % 2 == 0){
	            x++;
	        }
	        
	            for(int i = 0;i<n;i++){
	                
	                for(int j = 0;j<n;j++){
	                    
	                    if(i%2 != 0){
	                        
	                        if( j%2 ==0){
	                            
	                            System.out.print(count + x +" ");
	                        }else{
	                            System.out.print(count - x + " ");
	                        
	                             }
	                    
	                   }else{
	                       System.out.print(count + " ");
	                   }
	                   
	                   count++;
	              
	            }
	              System.out.println();
	           
	    
	}
}
}
}