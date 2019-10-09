                                        //JAVA PROGRAM FOR SORTING
import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner d= new Scanner (System .in);            
        int n,i,j,t;
        n=d.nextInt();                  
        int a[]=new int[n];
        for(i=0;i<n;i++)                    //LOOPING CONSTRUCT FOR TAKING INPUT IN ARRAY
        a[i]=d.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];                         //SORTING LOGIC
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");             //PRINTING OUT THE SORTED ARRAY
            }
            }
            
        
