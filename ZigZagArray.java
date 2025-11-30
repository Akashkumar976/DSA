import java.util.*;

public class ZigZagArray {
    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            System.out.println(minDecreases(a));
        }
    }

    static long minDecreases(long[] a) {
        int n = a.length;
        long ans = 0;

        // Make prefix non-decreasing (simulate operation 1)
        for (int i = 1; i < n; i++) {
            a[i] = Math.max(a[i], a[i - 1]);
        }

        // Now fix the awesome pattern
        for (int i = n - 2; i >= 0; i--) {
            if (i % 2 == 0) { // position 1-based: odd -> a[i] < a[i+1]
                if (a[i] >= a[i + 1]) {
                    ans += (a[i] - a[i + 1] + 1);
                    a[i] = a[i + 1] - 1;
                }
            } else { // position even -> a[i] > a[i+1]
                if (a[i] <= a[i + 1]) {
                    ans += (a[i  + 1] - a[i] + 1);    c
                    a[i] = a[i + 1] + 1;
                }  
            }
        }                                                                                                                                               m        c
}