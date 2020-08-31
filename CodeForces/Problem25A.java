import java.util.Scanner;

public class Problem25A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		int odd_count = 0;
		
		int even_index = 0;
		int odd_index=0;
		
		for(int i=0; i<n ; i++) {
			int num = sc.nextInt();
			if(num%2==0) {
				even_index=i;
			}
			else {
				odd_count++;
				odd_index=i;
			}
		}
		if (odd_count==1) {
			System.out.println(odd_index+1);
		}
		else {
			System.out.println(even_index+1);
		}
 
		sc.close();
	}
 
}
