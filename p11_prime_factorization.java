import java.util.Scanner;
public class p11_prime_factorization {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            while(n%i==0)
            {
                n/=i;
                System.out.print(i+" ");

            }
        }
        if(n!=1)
        System.out.print(n);
        sc.close();
    }
    
}
