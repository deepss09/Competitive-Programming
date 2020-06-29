/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args)
	{
	 		Scanner sc= new Scanner(System.in);
		try{int t=sc.nextInt();
	   	while(sc.hasNext()) {
		for(int i=0;i<t;i++) {
		int N=sc.nextInt();
		int B=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		int curr=1;
		int c=0;
		for(int j=0;j<m;j++) {
			int x=sc.nextInt();
		if((x/B)!=curr) {
			curr=x/B;
			c+=1;
		}
		if(!a.contains(c)) {
			a.add(c);
		}
		}
		System.out.println(a.size());
		}
		}
	}catch (Exception e){
	    return ;
	}
		
	}

}//WA
