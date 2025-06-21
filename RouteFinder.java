public class RouteFinder {
    public static void main(String[] args) {
        int arr[][] = {
            {0,1,0,0},
            {0,0,0,1},
            {0,1,0,0}
        };
        boolean used[][]=new boolean[arr.length][arr[0].length];
        findroute(new StringBuilder(), 0, 0, arr,used);
    }

    public static void findroute(StringBuilder sb, int r, int c, int[][] arr,boolean used[][]) {
                if (r<0||r >= arr.length ||c<0|| c >= arr[0].length || arr[r][c] == 1||used[r][c]) return;

        if (r == arr.length - 1 && c == arr[0].length - 1) {
            System.out.println("found " + sb.toString());
            return;
        }
        used[r][c]=true;
        findroute(new StringBuilder(sb).append('r'), r + 1, c, arr,used);
         findroute(new StringBuilder(sb).append('d'), r - 1, c, arr,used);
        findroute(new StringBuilder(sb).append('c'), r, c + 1, arr,used);
        findroute(new StringBuilder(sb).append('l'), r, c -1, arr,used);
         used[r][c]=false;




         
    }
}
