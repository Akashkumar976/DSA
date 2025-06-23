import java.util.Scanner;

public class Leetcode875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
        int h = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.minEatingSpeed(piles, h));
        sc.close();
    }
}

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        long s = 1, e = mx(piles);
        while (s <= e) {
            long mid = (s + e) / 2;
            if (able(piles, h, mid)) {
                ans = (int) mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    private static boolean able(int arr[], int h, long n) {
        int hour = 0;
        for (int t : arr) {
            hour += (t / n);
            if (t % n != 0) hour++;
            if (hour > h) return false;
        }
        return hour <= h;
    }

    private static long mx(int arr[]) {
        long s = 0;
        for (int t : arr) {
            s = Math.max(s, t);
        }
        return s;
    }
}
