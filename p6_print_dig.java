import java.util.Scanner;
public class p6_print_dig 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        while(n!=0)
        {
            int dig=n%10;
            System.out.println(dig);
            n/=10;
        }
    }
    
}
