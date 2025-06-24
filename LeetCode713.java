import java.util.*;

public class LeetCode713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter " + n + " positive integers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input value of k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        // Call the method to compute the result
        int result = numSubarrayProductLessThanK(arr, k);

        // Output the result
        System.out.println("Number of subarrays with product less than " + k + " is: " + result);
    }

    public static int numSubarrayProductLessThanK(int[] arr, int k) {
        if (k <= 1) return 0;

        int count = 0;
        int prod = 1;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            prod *= arr[end];

            while (prod >= k && start <= end) {
                prod /= arr[start];
                start++;
            }

            count += (end - start + 1);
        }

        return count;
    }
}
