import java.util.Scanner;

public class Problem552B {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      long n = sc.nextLong();
	      if(n<10) {
	    	  System.out.println((n+1)-1);
	      }else if(n<100) {
	    	  System.out.println((2*(n+1)-11));
	      }
	      else if(n<1000) {
	    	  System.out.println((3*(n+1)-111));
	      }
	      else if(n<10000) {
	    	  System.out.println(4*(n+1)-1111);
	      }
	      else if(n<100000) {
	    	  System.out.println(5*(n+1)-11111);
	      }
	      else if(n<1000000) {
	    	  System.out.println(6*(n+1)-111111);
	      }
	      else if(n<10000000) {
	    	  System.out.println(7*(n+1)-1111111);
	      }
	      else if(n<100000000)
	  	{
	  		System.out.println(8*(n+1)-11111111);
	  	}
	  	else if(n<1000000000)
	  	{
	  		System.out.println(9*(n+1)-111111111);
	  	}
	  	else
	  	{
	  		System.out.println(10*(n+1)-1111111111);
	  	}
	  }
	}

