import java.util.Scanner;
public class PowerXN {
    public static int power(int x, int y)
    {
        if (y==0)
            return 1;
        else if (y%2==0)
            return power(x,y/2)*power(x,y/2);
        else
            return x * power(x,y/2)*power(x,y/2);
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int base=in.nextInt();
        System.out.println("Enter the power value: ");
        int pow=in.nextInt();
        System.out.printf("%d", power(base,pow));
    }
}

