import java.util.Scanner;
public class p12_pythagorean_triplets {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2");
        int n2 = sc.nextInt();
        System.out.print("Enter num3");
        int n3 = sc.nextInt();

        int max = n1;
        if(max<n2)
            max =n2;
        if(max<=n3)
            max=n3;
        
        if(max == n1)
        {
            boolean flag = ((n2*n2)+(n3*n3)==(n1*n1));
            System.out.print(flag);

        }
        else if(max==n2)
        {
            boolean flag = ((n1*n1)+(n3*n3)==(n2*n2));
            System.out.print(flag);

        }
        else
            {
                boolean flag =((n1*n1)+(n2*n2)==(n3*n3));
                System.out.print(flag);

            }
        sc.close();
    }
    
}
