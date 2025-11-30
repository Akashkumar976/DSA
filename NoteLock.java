import java.util.*;

public class NoteLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // length of string
            int k = sc.nextInt(); // window size
            String s = sc.next(); // binary string

            System.out.println(minProtections(s, n, k));
        }
    }

    static int minProtections(String s, int n, int k) {
        int lastProtected = -k;  // last index where we protected or had a "blocking" 1
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                // If this 1 is too far from the last protected 1
                // (i.e., previous 1 can't protect it)
                if (i - lastProtected >= k) {
                    count++;           // protect this 1
                    lastProtected = i; // update the last protected position
                } else {
                    // Even if we don’t protect it,
                    // it’s still a blocking 1 for future ones
                    lastProtected = i;
                }
            }
        }
        return count;
    }
}
