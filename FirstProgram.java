
public class FirstProgram
{
public static void main(String[] args) {
        int radius = 5; 

        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                double distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

      

 

   
