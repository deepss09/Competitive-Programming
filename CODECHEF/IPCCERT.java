/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int k=scn.nextInt();
		int getcertis = 0;
		int cases = n;
		
		int c=0;
		for(int i=0;i<n;i++) {
			int s=0;
			for(int j=0;j<k;j++) {
				int x=scn.nextInt();
				s=s+x;
			}
			int q=scn.nextInt();
			if(q<=10 && (s>=m))
				c++;
		}
		System.out.println(c);

	}
}
