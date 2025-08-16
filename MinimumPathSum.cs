public class MinimumPathSum {
    static int min;

    public static void main(String[] args) {
        min = Integer.MAX_VALUE;
        int arr[][] = {
            {1, 4, 3},
            {5, 0, 6},
            {1, 2, 8}
        };
        boolean visited[][] = new boolean[arr.length][arr[0].length];
        pathsum(arr, 0, 0, 0, visited);
        System.out.println(min);
    }

    public static void pathsum(int arr[][], int r, int c, int sum, boolean[][] visited) {
        if (r < 0 || c < 0 || r >= arr.length || c >= arr[0].length || visited[r][c]) return;

        sum += arr[r][c];

        if (r == arr.length - 1 && c == arr[0].length - 1) {
            min = Math.min(min, sum);
            return;
        }

        visited[r][c] = true;

        pathsum(arr, r + 1, c, sum, visited); // down
        pathsum(arr, r - 1, c, sum, visited); // up
        pathsum(arr, r, c + 1, sum, visited); // right
        pathsum(arr, r, c - 1, sum, visited); // left
        pathsum(arr, r+1, c+1, sum, visited);

        visited[r][c] = false; // backtrack
    }
}
