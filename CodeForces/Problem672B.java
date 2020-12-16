import java.util.HashMap;
import java.util.Scanner;

public class Problem672B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
		String s = sc.next();
		HashMap<Character,Integer> hp = new HashMap<>();
		int count = 0;
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			if(hp.containsKey(ch)) {
				count++;
			}else {
				hp.put(ch,0);
			}
		}
		if(n>26){
		    System.out.println(-1);
		}else{
		    System.out.println(count);
		 
		}
		 
	}

}
