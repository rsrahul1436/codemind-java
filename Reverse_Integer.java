import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,rem,rev=0;
        n=sc.nextInt();
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
