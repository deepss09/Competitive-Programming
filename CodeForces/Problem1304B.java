import java.util.Scanner;

public class Problem1304B {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int m = sc.nextInt();
	 String ct []= new String[n];
	 String ot = "";
	 for(int i=0;i<n;i++) {
		 ct[i] = sc.next();
		 if(isPalindrome(ct[i]) && ot.length() == 0){
			 ot = ot+ct[i];
		 }
	 }
	 for(int i = 1; i < n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if(isReverse(ct[i], ct[j]))
				{
					ot = ct[i] + ot + ct[j];
				}
			}
		}
		System.out.println(ot.length());
		System.out.println(ot);
		
	}
	 

public static boolean isPalindrome(String str) {
	int i = 0, j = str.length()-1;
	while(i<j) {
		if(str.charAt(i) != str.charAt(j)) 
			return false;	
			i++;
			j--;
		}
		return true;

	}
	public static boolean isReverse(String str1, String str2) {
		boolean flag = true;
		for(int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(str1.length() - i - 1))
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}