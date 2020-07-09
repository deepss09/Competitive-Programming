/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   	Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        for(int k =0;k<n;k++){
            
            int a[]= new int[5];
            for(int i=0;i<5;i++){
                a[i]= in.nextInt();
            }
            int c=0;
            for(int i=0;i<5;i++){
                if(a[i]==1){
                    c++;
                }
                else{
                    c+=0;
                }
            }
            switch(c){
                case 0:
                    System.out.println("Beginner");
                    break;
                case 1:
                    System.out.println("Junior Developer");
                    break;
                case 2:
                    System.out.println("Middle Developer");
                    break;
                case 3:
                    System.out.println("Senior Developer");
                    break;
                case 4:
                    System.out.println("Hacker");
                    break;
                case 5:
                    System.out.println("Jeff Dean");
                    break;
            }
        }
	}
}