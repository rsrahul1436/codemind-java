import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<(n-1);i++)
        {
            if(arr[i]%2!=0)
            {
                if(arr[i-1]%2==0 && arr[i+1]%2==0)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}