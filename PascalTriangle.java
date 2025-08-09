import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Generate(sc.nextInt());
        sc.close();
    }
    public static void Generate(int n)
    {
        for (int i =0; i <n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("   ");
            }
            int curr=1;
            for (int j = 0; j <=i; j++) {
                System.out.print("      ");
               System.out.print(curr);
                curr=curr*(i-j)/(j+1);
            }
            System.out.println();
        }
    }

}
