import java.util.Scanner;
public class p4_print_fib 
{
    public static  void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int fib=0,b=1;
        while(fib<=n)
        {
            System.out.println(fib);
            int c = fib+b;
            fib=b;
            b=c;
        }
        
     sc.close();
    }
    
}
