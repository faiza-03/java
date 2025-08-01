import java.util.Scanner;
public class p9_rotate_num
{
    public static void main(String[] aStrings)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        //find no.of digits
        int temp=n,count=0;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }

        k = k%count;
        if(k<0)
            k=k+count;
        
        int div = (int)Math.pow(10,k);
        int mul = (int)Math.pow(10,count-k);
        int q=n/div;
        int rem=n%div;
        int r = rem*mul+q;
        System.out.print(r);


        sc.close();
    }
    
}
