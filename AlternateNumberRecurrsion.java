public class AlternateNumberRecurrsion {
    public static void main(String[] args) {
        alternate(5);
        alternateup(1);
    }
    public static void alternate(int n)
    {
        if(n==0)return;
        System.out.println(n);
        alternate(n);

    }
    
}
