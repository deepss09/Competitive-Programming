import java.util.Scanner;

public class Problem519A {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String s[] = new String[8];
	  int weight[] = {9,5,3,3,1,0};
	  char white[] = {'Q','R','B','N','P','K'};
	  char black[] = {'q','r','b','n','p','k'};
	  int swhite = 0, sblack = 0;
	  for(int i=0;i<8;i++) {
		  s[i] = sc.nextLine();
	  }
	  for(int i=0;i<8;i++) {
		 String test = null;
		 test = s[i];
		 int m = test.length();
		 for(int j=0;j<m;j++) {
			 for(int k=0;k<6;k++) {
				 if(test.charAt(j) == white[k]) {
					 swhite+=weight[k];
				 }
				 if(test.charAt(j) == black[k]) {
					 sblack+=weight[k];
					 }
				 }
			 }
				 test= null;
				 }
				 
				 if(swhite>sblack) 
					 System.out.print("White");
				 if(sblack>swhite)
					 System.out.print("Black");
				if(sblack == swhite)
					 System.out.print("Draw");
				 }
			 }


//		Scanner input = new Scanner(System.in);
//		String[] s= new String[8];
//		char[] white ={ 'Q', 'R', 'B', 'N', 'P', 'K' }; 
//		char[] black ={ 'q', 'r', 'b', 'n', 'p', 'k'};
//		int[] verif={ 9, 5, 3, 3, 1, 0};
//		int s_white=0,s_black=0;
//		for (int i = 0; i < 8; i++) {
//			s[i] =input.nextLine();}
//		for (int i = 0; i < 8; i++) {
//			String test = null;
//			test=s[i];
//			int test1=test.length();
//			for(int j=0; j<test1; j++) {
//				for(int k=0; k<6; k++) {
//			if(test.charAt(j)==white[k]) {
//				 s_white+=verif[k];
//			}
//			if(test.charAt(j)==black[k]) {
//				s_black+=verif[k];}}}
//			test = null;}
//		if(s_white>s_black)
//		System.out.print("White");
//		if(s_white<s_black)
//		System.out.print("Black");
//		if(s_white==s_black)
//		System.out.print("Draw");
//		input.close();
//		}
//	}
