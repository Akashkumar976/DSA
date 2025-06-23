import java.util.*;

public class AllocateMinimumPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the number of pages in each book:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of students: ");
        int k = sc.nextInt();

        int res = findPages(arr, k);
        System.out.println("Minimum number of maximum pages allocated: " + res);
    }

    public static int findPages(int[] arr, int k) {
        if (arr.length < k) return -1;

        int sum = 0;
        int max = 0;
        for (int t : arr) {
            sum += t;
            max = Math.max(max, t);
        }

        int ans = -1, s = max, e = sum;
        while (s <= e) {
            int mid = (e + s) / 2;
            if (possible(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    private static boolean possible(int[] arr, int k, int maxp) {
        int cp = 0, s = 1;
        for (int t : arr) {
            if (cp + t > maxp) {
                cp = t;
                s++;
                if (s > k) return false;
            } else {
                cp += t;
            }
        }
        return true;
    }
}
