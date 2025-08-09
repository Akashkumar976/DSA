public class ArrowPattern {
    public static void main(String[] args) {
        generate(5);
    }
    public static void generate(int n)
    {
        for (int i = 0; i < n-1; i++) {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                
            System.out.print("* ");
            }
            System.out.println();
        }
                for (int i = n-1; i>=0; i--) {
                              for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}
