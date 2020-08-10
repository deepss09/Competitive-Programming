import java.util.Scanner;

public class Problem369A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int p = sc.nextInt();
		int ans=0;
		int d[]=new int[n];
		for(int i=0;i<n;i++){
		    d[i]=sc.nextInt();
		    if(d[i]==1){
		        if(b==0){
		            ans++;
		        }
		      else
		        b--;
		    }
		    else{
		        if(p==0){
		            if(b==0){
		                ans++;
		            }
		            else b--;
		        }
		        else p--;
		    }
		    
		}
		System.out.println(ans);
	}
}