import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double sum=0;
        n=sc.nextInt();
        for (float i=1;i<=n;i++)
        {
            sum+=1/i;
        }
        System.out.format("%.2f",sum);
    }
}