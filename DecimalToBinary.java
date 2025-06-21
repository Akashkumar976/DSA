public class DecimalToBinary {
    public static void main(String arg[])
    {
        int n=6;
        int ans=100;
        int x=1;
        while(n>0)
        { 
            x=x+(n%2*ans);
            ans/=10;
            n/=2;
        }
        System.out.println(ans);
    }
}
