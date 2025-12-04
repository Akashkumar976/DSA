class Solution2211 {
    public int countCollisions(String d) {
        int n = d.length();
        int i = 0, j = n - 1;
        
        while (i < n && d.charAt(i) == 'L') i++;
        
        while (j >= 0 && d.charAt(j) == 'R') j--;
        
        int ans = 0;
        
        for (int k = i; k <= j; k++) {
            if (d.charAt(k) != 'S')
                ans++;
        }
        
        return ans;
    }
}
