public class Reverse_String
{
    public static void main(String[] args)
    {
        String str= "ABCDEFG";
        String abc=" ";

        for(int i=str.length()-1;i>=0;i--)
        {
            abc= abc+str.charAt(i);
        }

        System.out.println(abc);
    }
}