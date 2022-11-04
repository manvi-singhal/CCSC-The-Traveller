import java.util.*;
class Codechef
{
    public static void main (String[] args)
    {
        InputStream in=System.in;
        InputReader sc=new InputReader(in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int a[]=new int[n];
            int i,exp=0;
            for (i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                exp+=a[i];
            }
            if (sum>=exp)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
