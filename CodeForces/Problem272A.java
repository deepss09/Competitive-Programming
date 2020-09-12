import java.util.Scanner;

public class Problem272A {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int sum = 0;
	   for(int i=0;i<n;i++) {
		   int fingers = sc.nextInt();
		   sum+=fingers;
	   }
	   int count = 0;
	   for(int i=1;i<=5;i++) {
		   if((sum+i)%(n+1)!=1){
			   count++;
		   }
	   }
	   System.out.println(count);

	}

}
