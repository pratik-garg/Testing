import java.util.*;
class maxi
{
    public static void main(String args[])
    {
        Scanner d=new Scanner(System.in);
        int i,max,n;
        n=d.nextInt();
        int a[]=new int[n];
        max=a[0];
        for(i=0;i<n;i++)
        a[i]=d.nextInt();
        for(i=0;i<n;i++)
        {if(a[i]>max)
        max=a[i];}
        System.out.println(max); // Printing max value
    }}
    
