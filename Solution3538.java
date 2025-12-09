class Solution3538 {
    public int specialTriplets(int[] nums) {
        final int MOD = 1_000_000_007;

        long[] freqPrev = new long[200001];
        long[] freqNext = new long[200001];

        for (int x : nums) freqNext[x]++;

        long ans = 0;

        for (int j = 0; j < nums.length; j++) {
            int mid = nums[j];
            freqNext[mid]--;

            int need = mid * 2;
            if (need <= 200000) {
                long left = freqPrev[need];
                long right = freqNext[need];
                ans = (ans + (left * right) % MOD) % MOD;
            }

            freqPrev[mid]++;
        }

        return (int) ans;
    }
}
