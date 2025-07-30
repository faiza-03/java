import java.util.Scanner;
public class p3_prime_primes 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low:");
        int low = sc.nextInt();

        System.out.print("Enter the number:");
        int num = sc.nextInt();
        //int low = sc.nextInt();

        for(int i=low;i<num;i++)
        {
            boolean prime = true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                //boolean prime = false;
                if(i%j==0)
                {
                    prime = false;
                    break;
                }
            }

        
            if(prime==true)
                System.out.println(i);
        }
    sc.close();
    }
    
}
