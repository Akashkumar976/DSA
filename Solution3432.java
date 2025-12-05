class Solution3432 {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];

        int psum = 0;
        int ans = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            psum += nums[i];
            sum -= nums[i];

            if ((sum - psum) % 2 == 0) ans++;
        }

        return ans;
    }
}
