import java.util.Scanner;

public class Problem1382B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int flag = 0, index = n;
			int arr[]= new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			   if(flag == 0 && arr[i] > 1) {
				   flag = 1;
				   index = i;
			   }
		}
          if(flag == 1) {
        	  if(index%2==0) {
        		  System.out.println("First");
        	   }
              else System.out.println("Second");
          }
          else{
              if(index%2==0){
                  System.out.println("Second");
              }
              else System.out.println("First");
        	  }
          }
	}

	}

