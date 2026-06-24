public class Palindrome {

    public static void main(String[] args)
    {
        String str= "Madsf";
        String abc= "";

        for(int i=str.length()-1; i>=0; i--)
        {
            abc=abc+str.charAt(i);
        }

        System.out.println(abc);

        if(str.equals(abc))
        {
            System.out.println(str+" is a Palindrome");
        }
        else
            System.out.println(str+" is not a Palindrome");


        String kfc= "AK KA ahja uaa";

        String result= kfc.replaceAll("\\s+","");
        System.out.println(result);

        String kdg="v";
        System.out.println(kdg.isEmpty());

    }
}
