public class IntoductionToConstructor {
    public static void main(String args[])
    {
   new Hello("Akash");
   new Hello();
        
    }
}
class Hello{
    Hello()
    {
        System.out.println("Hello friend");
    }
        Hello(String s)
    {
        System.out.println("Hello "+s);
    }
}
