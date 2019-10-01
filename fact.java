import java.util.*;
class fact
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int i,f,n;
        f=1;
        n=d.nextInt();
        for(i=1;i<=n;i++)
        f=f*i;
        System.out.println(f);
    }}
    