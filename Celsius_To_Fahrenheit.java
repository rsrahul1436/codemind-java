import java.util.*;
public class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        double f;
        f=(n*1.8)+32;
        System.out.format("%.2f",f);
    }
}