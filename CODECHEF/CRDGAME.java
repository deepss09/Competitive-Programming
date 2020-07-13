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
	        int rounds = sc.nextInt();
	        int chef = 0, morty = 0;
	        while(rounds -->0){
	            int chefSum = sumofDigits(sc.nextInt());
	            int mortySum = sumofDigits(sc.nextInt());
	            if(chefSum > mortySum){
	                chef++;
	            }
	            else if(chefSum == mortySum){
	                chef++;
	                morty++;
	            }
	            else{
	                morty++;
	            }
	        }
	        if(chef > morty)
		        System.out.println(0 + " " + chef);
		    else if( morty > chef)
		        System.out.println(1 + " " + morty);
		    else
		        System.out.println(2 + " " + chef);
		}
		sc.close();
	}
	    	static int sumofDigits(int n){
	    if(n > 0){
	        int sum = 0;
	    while(n > 0){
	        sum += n % 10;
	        n /= 10;
	    }
	    return sum;
	    }
	    return 0;
	}
}
