import java.util.Scanner;

public class favourirteSequence {
 public static void arrange(int b[],int n) {
	 
 int i = 0;
	 int j = n-1;
     int value = 1;
     while(i<=j){
         if(value%2==1){
         b[i] = value;
         value++;
         i++;
         }else{
        b[j] = value;
         value++;
         j--;
     }
     }
 }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-->0) {
			 int n = sc.nextInt();
			 int b[] = new int[n];
             for(int i=0;i<n;i++) {
            	 b[i] = sc.nextInt();
             }
//             System.out.print(arrange(b,n));
		 }
	    }
	}