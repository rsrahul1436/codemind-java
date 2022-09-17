import java.util.*;
class file 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int X,Y;
        X=sc.nextInt();
        Y=sc.nextInt();
        if(X==0 && Y%2==0)
        {
            System.out.println("YES");
        }
        else if(X==0 && Y%2!=0)
         {
            System.out.println("NO");
         }
        else if((X+(2*Y))%2==0)
         {
            System.out.println("YES");
         }
         else
          {
            System.out.println("NO");
        }
    }
}