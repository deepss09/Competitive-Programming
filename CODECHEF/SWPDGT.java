/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			try{
            Scanner in=new Scanner(System.in);
           int t =in.nextInt();

           for(int j=0; j< t; j++) {
                  int s1=in.nextInt();
                  int s2=in.nextInt();
             int f1=s1/10;
             int l1=s1%10;
               int f2=s2/10;
             int l2=s2%10;
             int a[]=new int[4];

             if (s1<10 && s2<10){
            System.out.println(s1+s2);}
            else if(s1<10 && s2>=10){
                System.out.println(Math.max(s1+s2, s1*10+f2+l2));}
            else if(s1>=10 && s2<10){
                System.out.println(Math.max(s1+s2, s2*10+f1+l1));}
            else {



             a[0]=(f1*10+f2)+(l1*10+l2);
             a[1]=(f1*10+l1)+(f2*10+l2);
             a[2]=(f1*10+l2)+(f2*10+l1);
              a[3]=(l2*10+l1)+(f2*10+f1);
             Arrays.sort(a);

              System.out.println(a[3]);
            }
            }

        }catch(Exception e){
        }
	}
}
