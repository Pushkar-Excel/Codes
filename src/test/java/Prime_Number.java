import java.util.Scanner;

public class Prime_Number
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:- ");
        int N=sc.nextInt();

        boolean isPrime= N > 1;

        for(int i=2; i<N;i++)
        {
            if(N%i==0)
            {
                isPrime = false;
                break;
            }
        }

       System.out.println(isPrime?"Prime":"Not Prime");

        System.out.println("Enter the second number:- ");
        int n=sc.nextInt();

        Prime_Number obj=new Prime_Number();
        System.out.println(obj.PrimeNumber(n) ? "Prime":"Not Prime");

    }

    public boolean PrimeNumber(int n)
    {
        if(n<=1)
            return false;

        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;
    }
}

