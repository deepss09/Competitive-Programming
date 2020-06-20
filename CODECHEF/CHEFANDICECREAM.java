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
		int t=sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int coin5 = 0;
		    int coin10 = 0;
		    int coin15 = 0;
		    String s = "YES";
			int a[] = new int[n];
			for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
			
			for(int i = 0; i < n; i++)
			{
				if(a[i] == 5)
				coin5 ++;
				
				else if(a[i] == 10)
				{
					if(coin5 >= 1)
					{
						coin5 --;
						coin10++;
					}
					else
					{
						s = "NO";
						break;
					}
					
				}
				else if(a[i] == 15)
				{
					if(coin10 >= 1)
					{
						coin10--;
						coin15++;
					}
					else if(coin5 >= 2)
					{
						coin5 -= 2;
						coin15++;
					}
						else
					{
						s = "NO";
						break;
					}
				}
			}
			System.out.println(s);
		}
	}
}