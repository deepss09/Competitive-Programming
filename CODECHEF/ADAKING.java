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
		char a[][] = new char[8][8];
		while(t-->0){
		    int n = sc.nextInt();
		    for(int i=0;i<8;i++){
		        for(int j=0;j<8;j++){
		            if(n > 0)
		                a[i][j] = '.';
		                else
		                a[i][j] = 'X';
		                n--;
		            }
		    }
		            a[0][0] = 'O';
		             for(int i=0;i<8;i++){
	            for(int j=0;j<8;j++){
	            System.out.print(a[i][j]);
	            }
	            System.out.println();
	        }
		        }
		    }
	}