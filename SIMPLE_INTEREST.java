import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int P,T,R,si,sim;
        P=sc.nextInt();
        T=sc.nextInt();
        R=sc.nextInt();
        si=P*T*R;
        sim=si/100;
        System.out.println(sim);
    }
}