public class Power {
    public static void main(String[] args) {
        System.out.println(pow(2,2));
    }
    public static int pow(int n,int x)
    {
        if(x==0)return 1;
        return n*pow(n,x-1);
    }
    
}
