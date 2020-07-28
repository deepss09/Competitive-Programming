import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TravelRestrictions {
    public static void main(String[] args) throws IOException {
        try {
//            PrintWriter writer;
//            writer = new PrintWriter("Travelrestrictionoutput.txt");
//            BufferedReader br = null;
//            FileReader fr = null;
//           fr = new FileReader("C:\\Users\\deepali\\Downloads\\travel_restrictions_validation_input.txt");
//           br = new BufferedReader(fr);
        	BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            String str = "";
            int x=1;
            int test = Integer.parseInt(br.readLine());

            String line=null;
            int i=0;
            for (i = 1; i <=test; i++) {
                line = br.readLine();
                int n = Integer.parseInt(line);
                String in,out;
                in=br.readLine();
                out=br.readLine();
                char[][] p=new char[n+1][n+1];
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        p[j][k]='N';
                    }
                }
                for(int m=0;m<n;m++){
                    p[m][m]='Y';
                    if(m>0 && out.charAt(m)=='Y'){
                        for(int j=m-1;j>=0;j--){
                            if(in.charAt(j)=='Y') p[m][j]='Y';
                            else break;
                            if(out.charAt(j)=='N') break;
                        }
                    }
                    if(m<n-1 && out.charAt(m)=='Y'){
                        for(int j=m+1;j<n;j++){
                            if(in.charAt(j)=='Y') p[m][j]='Y';
                            else break;
                            if(out.charAt(j)=='N') break;
                        }
                    }
                }
               System.out.println("Case #"+x+":");
                x++;
                for(int z=0;z<n;z++){
                    for(int j=0;j<n;j++){
                        System.out.print(p[z][j]);
                    }
                    System.out.println();
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}