public class Inverted_Triangle {

    public static void main(String[] args)
    {
        int N=5;

        for(int i=0;i<=N; i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
