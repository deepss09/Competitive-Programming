/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   	try {
            Scanner scanner = new Scanner(System.in);
            int testCase = scanner.nextInt();

            for (int i = 0; i < testCase; i++) {
                String first = scanner.next();
                String second = scanner.next();
                boolean flag = false;

                for (int j = 0; j < 3; j++) {
                    if (first.charAt(j) == 'o' || second.charAt(j) == 'o') {
                        int counter = 0;
                        for (int k = 0; k < 3; k++) {
                            if (j != k) {
                                if (first.charAt(k) == 'b' || second.charAt(k) == 'b') {
                                    counter++;
                                }
                            }
                        }
                        if (counter == 2) {
                            flag = true;
                        }
                    }
                }
                if (flag) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }


            }

        } catch (
                Exception e) {
        }
	
	}
}
