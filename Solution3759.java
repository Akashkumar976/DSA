class Solution3759 {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int qualifiedDudes = 0;

        int slowSnail = 0;
        while (slowSnail < n) {

            int fastRabbit = slowSnail;

            // Count duplicates (aka twins)
            while (fastRabbit < n && nums[fastRabbit] == nums[slowSnail])
                fastRabbit++;

            int twinCount = fastRabbit - slowSnail;  // frequency of the current value
            int biggerBullyCount = n - fastRabbit;   // elements strictly greater

            if (biggerBullyCount >= k)
                qualifiedDudes += twinCount;

            slowSnail = fastRabbit; // hop to next unique value
        }

        return qualifiedDudes;
    }
}
