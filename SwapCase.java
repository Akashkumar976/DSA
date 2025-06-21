public class SwapCase {
    public static void main(String args[])
    {
        int d='a'-'A';
        String s="AkashKumar";
        for(char c:s.toCharArray())
        {
            if(c>='A'&&c<='Z')
            {
                System.out.print((char)(c+d));
            }
            else
                System.out.print((char)(c-d));

        }
        
    }
}
