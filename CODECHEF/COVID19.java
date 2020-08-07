/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();

		for(int i=0;i<t;i++)
		{
			int n= sc.nextInt();
			int[] arr=new int[n];
				for(int j=0;j<n;j++)
					arr[j]=sc.nextInt();

				ArrayList<Integer> list=new ArrayList<>();
				int count=1;

				for(int j=0;j<n-1;j++)
				{
					if(arr[j+1]-arr[j]<=2)
						count++;
					else
					{
						list.add(count);
						count =1;
					}
				}
				list.add(count);

				Collections.sort(list);
				System.out.println(list.get(0)+" "+list.get(list.size()-1));
		}
	}
}
