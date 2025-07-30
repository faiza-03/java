import java.util.Scanner;

public class p2_check_prime 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        boolean prime =true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime==true)
            System.out.println("prime");
        else
            System.out.println("Not prime");
    sc.close();
    }
    
    
}
