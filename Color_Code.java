import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s,V,I,B,G,Y,O,R;
        s=sc.nextLine().charAt(0);
        if (s=='v' ||s=='V')
        System.out.println("Violet");
        else if (s=='i' ||s=='I')
        System.out.println("Indigo");
        else if (s=='b' ||s=='B')
        System.out.println("Blue");
        else if (s=='g' ||s=='G')
        System.out.println("Green");
        else if (s=='Y' ||s=='y')
        System.out.println("Yellow");
        else if (s=='o' ||s=='O')
        System.out.println("Orange");
        else if (s=='R' ||s=='r')
        System.out.println("Red");
        else
        System.out.println("-1");
    }
}