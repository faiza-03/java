import java.util.Scanner;
public class p10_gcd_lcm {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        int n1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int n2 = sc.nextInt();

        int num1=n1,num2=n2;
        while(num1%num2!=0)
        {
            int rem = num1%num2;
             num1 = num2;
             num2 = rem;
        }
        int gcd = num2;
        int lcd = (n1*n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcd);
        
        sc.close();
    }
    
}
