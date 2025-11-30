import java.util.*;

public class ClockCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t = sc.nextLine().split(":");
        int h = Integer.parseInt(t[0]) % 12;
        int m = Integer.parseInt(t[1]);

        int q = sc.nextInt();
        int A = sc.nextInt(), B = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();

        int[] angles = new int[q];
        for (int i = 0; i < q; i++) angles[i] = sc.nextInt();

        int total = 0;
        for (int ang : angles) {
            total += minCost(h, m, ang, A, B, X, Y);
        }
        System.out.println(total);
        sc.close();
    }

    static int minCost(int h, int m, int ang, int A, int B, int X, int Y) {
        int minC = Integer.MAX_VALUE;

        // Hour hand in multiples of 30 degrees
        for (int hh = 0; hh < 12; hh++) {
            int dh = hh * 30 - h * 30;
            int dhCw = (dh + 360) % 360;
            int dhAcw = (360 - dhCw) % 360;

            int hcw = dhCw * X * A;
            int hacw = dhAcw * X * B;

            // Minute hand 0 to 59
            for (int mm = 0; mm < 60; mm++) {
                int dm = mm - m;
                int dmCw = (dm + 60) % 60 * 6; // degrees
                int dmAcw = (360 - dmCw) % 360;

                // Angle between hands
                int hourDeg = hh * 30;
                int minDeg = mm * 6;
                int curAng = Math.abs(hourDeg - minDeg);
                curAng = Math.min(curAng, 360 - curAng);

                if (curAng == ang) {
                    int cost1 = hcw + dmCw * Y * A;
                    int cost2 = hcw + dmAcw * Y * B;
                    int cost3 = hacw + dmCw * Y * A;
                    int cost4 = hacw + dmAcw * Y * B;
                    minC = Math.min(minC, Math.min(Math.min(cost1, cost2), Math.min(cost3, cost4)));
                }
            }
        }

        return minC;
    }
}
