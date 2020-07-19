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
		int test = in.nextInt();
		while(test-- > 0) {
		    int n = in.nextInt();in.nextLine();
		    String str = in.nextLine();
		    
		    Map<Character, Integer> mp = new HashMap<Character, Integer>();
		    
		    for (int i = 0; i < str.length(); ++i) {
		        char ch = str.charAt(i);
		        
		        if(!mp.containsKey(ch)) {
                    mp.put(ch, 1);
                }
                else {
                    mp.put(ch, mp.get(ch) + 1);
                }
		    } 
		    
		    int flag = 0;
		    
		    for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    flag = -1;
                }
            }
            
            if (flag != 0) {
                System.out.println("NO");
            }
            else System.out.println("YES");
		    
		}
	}
}
