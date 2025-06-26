public class RecurssionGFG {
    public static void main(String[] args) {
        p(10);
    }
    public static void p(int n)
    {
        if(n==0)return;
        System.out.println("GFG");
        p(n-1);
    }
}
