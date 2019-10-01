import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner d= new Scanner (System .in);
        int n,i,j,t;
        n=d.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=d.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
            }
            }
            
        