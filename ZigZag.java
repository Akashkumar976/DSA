public class ZigZag {
    public static void main(String[] args) {
        printpattern(2);
    }
    public static void printpattern(int n)
    {
        if(n==0)return;
        System.out.print(n+" ");
        printpattern(n-1);
        System.out.print(n+" ");
        printpattern(n-1);
        System.out.print(n+" ");
    }
    
}
