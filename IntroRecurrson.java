public class IntroRecurrson {
    public static void main(String[] args) {
        printhello(10);
    }
    public static void printhello(int n )
    {
        if(n==0)return;
        System.out.println(n);
        printhello(n-1);
        System.out.println(n);

    }
 
    
}
