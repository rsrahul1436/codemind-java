import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        c=a;
        b=sc.nextInt();
        while(true)
        {
            if(c%a==0 && c%b==0)
            {
                System.out.println(c);
                break;
            }
            c++;
        }
    }
}