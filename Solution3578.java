import java.util.*;

class Solution3578 {
    public int countPartitions(int[] a, int k) {
        int n = a.length, M = 1_000_000_007;
        long[] dp = new long[n], pre = new long[n];
        Deque<Integer> mx = new ArrayDeque<>(), mn = new ArrayDeque<>();
        int l = 0;

        dp[0] = 1;
        pre[0] = 1;
        mx.add(0);
        mn.add(0);

        for (int i = 1; i < n; i++) {
            while (!mx.isEmpty() && a[mx.peekLast()] <= a[i]) mx.pollLast();
            mx.add(i);
            while (!mn.isEmpty() && a[mn.peekLast()] >= a[i]) mn.pollLast();
            mn.add(i);

            while (a[mx.peekFirst()] - a[mn.peekFirst()] > k) {
                if (mx.peekFirst() == l) mx.pollFirst();
                if (mn.peekFirst() == l) mn.pollFirst();
                l++;
            }

            if (l == 0) dp[i] = (1 + pre[i - 1]) % M;
            else {
                int idx = l - 2;
                long sub = (idx >= 0) ? pre[idx] : 0;
                dp[i] = (pre[i - 1] - sub + M) % M;
            }

            pre[i] = (pre[i - 1] + dp[i]) % M;
        }

        return (int) dp[n - 1];
    }

    public static void main(String[] args) {
        Solution3578 s = new Solution3578();

        int[] nums1 = {9, 4, 1, 3, 7};
        int k1 = 4;
        System.out.println(s.countPartitions(nums1, k1)); // Expected: 6

        int[] nums2 = {3, 3, 4};
        int k2 = 0;
        System.out.println(s.countPartitions(nums2, k2)); // Expected: 2
    }
}
