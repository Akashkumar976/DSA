public class NthPrimeNumber {
    public static void  main(String arg[])
    {
        System.out.println("The Nth prime number is:- "+NthPrime(1));
    }
    public static int NthPrime(int n)
    {
        int i=2;
        int cnt=1;
        while(cnt<=n)
        {
            if(prime(i))
            {
                if(cnt==n)
                {
                    return i;
                }
                cnt++;
            }
            i++;
        }
        return 0;
    }
    public static boolean prime(int n)
    {
        if(n==2)return true;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)return false;
        }
        return true;
    }
}
