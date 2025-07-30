import java.util.Scanner;
public class p7_reverse_num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int rev = 0;
        while(n!=0)
        {
            int dig=n%10;
            rev = rev*10+dig;
            n/=10;
        }
        System.out.print(rev);

    }
}