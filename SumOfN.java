import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Sum of N natural numbers:- "+sum(sc.nextInt()));
    }
    public static int sum(int n)
    {
        if(n==1)return 1;
        return n+sum(n-1);
    }
}
