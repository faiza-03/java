import java.util.Scanner;
public class p6_print_dig 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        //count no.of digits
        int count = 0;
        int temp = n;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }

        //divisor = 10^(count-1);
        int div = (int)Math.pow(10,count-1);

        //extract digits and print
        while(div!=0)
        {
            int q = n/div;
            System.out.println(q);
            n%=div;
            div/=10;
        }
       
    }
    
}
