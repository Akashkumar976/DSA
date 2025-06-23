import java.util.Scanner;

public class LeetCode410 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.splitArray(nums, k);

        System.out.println("Minimum largest sum after splitting: " + result);
    }
}

class Solution {
    public int splitArray(int[] nums, int k) {
        int s = 0, e = 0, ans = 0;
        for (int t : nums) {
            s = Math.max(s, t);
            e += t;
        }
        while (s <= e) {
            int mid = (e + s) / 2;
            if (possible(nums, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    private static boolean possible(int[] arr, int k, int maxSum) {
        int currentSum = 0, splits = 1;
        for (int t : arr) {
            if (currentSum + t > maxSum) {
                currentSum = t;
                splits++;
                if (splits > k) return false;
            } else {
                currentSum += t;
            }
        }
        return true;
    }
}
