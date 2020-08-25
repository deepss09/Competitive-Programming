import java.util.Scanner;

public class Problem327A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
	        int count1=0;
	        int max=-1;
	        int count_zero=0;
	        while(n-->0){
	            int a=sc.nextInt();
	            if(a==1){
	                count1++;
	                if(count_zero>0){
	                  count_zero--;
	                }
	            }
	            else{
	                count_zero++;
	                max=Math.max(max,count_zero);
	            }
	            
	        }
	        
	        System.out.println(count1+max);
	    }
	}