import java.util.*;

public class Leetcode2594 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of mechanics: ");
        int n = sc.nextInt();
        int[] ranks = new int[n];
        System.out.println("Enter the ranks of the mechanics:");
        for (int i = 0; i < n; i++) {
            ranks[i] = sc.nextInt();
        }
        System.out.print("Enter the number of cars to be repaired: ");
        int cars = sc.nextInt();
        long res = new Solution().repairCars(ranks, cars);
        System.out.println("Minimum time to repair all cars: " + res);
    }
}

class Solution {
    public long repairCars(int[] ranks, int cars) {
        long ans = 0, s = 1, e = (long) 1e14;
        while (s <= e) {
            long mid = (e + s) / 2;
            if (repaired(ranks, mid, cars)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    private static boolean repaired(int arr[], long time, int cars) {
        int c = 0;
        for (int t : arr) {
            c += (int) Math.sqrt((double) time / t);
            if (c >= cars) return true;
        }
        return false;
    }
}
