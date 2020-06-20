/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int amount = s.nextInt();
	    double balance = s.nextDouble();
	    double rem_bal;
	    if(amount%5 == 0){
	        if(amount < balance && (amount + 0.5) <= balance){
	            
	            rem_bal = balance-amount-(0.5);
	            System.out.println(rem_bal);
	        }
	         else {
	             System.out.println(balance);
	         }
	    }
	         else{
	             System.out.println(balance);
	         }
	   
	}
}