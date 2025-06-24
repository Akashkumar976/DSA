import java.util.Scanner;

public class LeetCode1011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of packages:");
        int n = scanner.nextInt();
        int[] weights = new int[n];

        System.out.println("Enter the weights of the packages:");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of days to ship:");
        int days = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.shipWithinDays(weights, days);

        System.out.println("Minimum capacity required to ship packages within " + days + " days: " + result);
    }
}

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s = 0, e = 0, ans = 0;
        for (int t : weights) {
            s = Math.max(s, t);
            e += t;
        }
        while (s <= e) {
            int mid = (e + s) / 2;
            if (possible(weights, days, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    private static boolean possible(int[] arr, int k, int lg) {
        int c = 0, l = 1;
        for (int t : arr) {
            if (t + c > lg) {
                c = t;
                l++;
                if (l > k) return false;
            } else {
                c += t;
            }
        }
        return true;
    }
}
