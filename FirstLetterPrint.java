public class FirstLetterPrint {
    public static void main(String[] args) {
        String s="abs derf ghi jkl";
        String arr[]=s.split("\\s+");
        for(String t:arr)
        {
            System.out.println(t.charAt(0) );
        }

    }
}
