class Solution955 {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        int n = strs.length;
        int m = strs[0].length();
        boolean[] sorted = new boolean[n - 1];

        for (int i = 0; i < m; i++) {
            boolean delete = false;

            for (int j = 0; j < n - 1; j++) {
                if (!sorted[j] && strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    delete = true;
                    break;
                }
            }

            if (delete) {
                ans++;
            } else {
                for (int j = 0; j < n - 1; j++) {
                    if (!sorted[j] && strs[j].charAt(i) < strs[j + 1].charAt(i)) {
                        sorted[j] = true;
                    }
                }
            }
        }

        return ans;
    }
}
