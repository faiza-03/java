import java.util.Scanner;
public class p8_inverse_num 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();


        int pos=0,inv=0;
        while(n!=0)
        {
            int dig = n%10;
            pos++;
            inv = inv + pos *(int) Math.pow(10,dig-1);
            n/=10;
        }
        System.out.print(inv);
    }

    /*
     * 
     */
    
}
