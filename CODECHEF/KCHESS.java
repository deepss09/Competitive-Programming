import java.util.*;
import java.lang.*;
class Chess 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i,k=0;
        while(t>0)
        {
            k=0;
            int n=sc.nextInt();
            int x[]=new int[n];
            int y[]=new int[n];
            int a,b,c=0;
            for(i=0;i<n;i++)
            {
                x[i]=sc.nextInt();
                y[i]=sc.nextInt();
            }
            a=sc.nextInt();
            b=sc.nextInt();
            int posx[]={a,a-1,a-1,a-1,a,a+1,a+1,a+1,a};
            int posy[]={b,b-1,b,b+1,b+1,b+1,b,b-1,b-1};
            while(k<9)
            {
                for(i=0;i<n;i++)
                {
                    if((Math.abs(posx[k]-x[i])==1&&Math.abs(posy[k]-y[i])==2)||(Math.abs(posx[k]-x[i])==2&&Math.abs(posy[k]-y[i])==1))
                    {
                        c++;
                        break;
                    }
                }
                k++;
            }
            if(c==9)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
