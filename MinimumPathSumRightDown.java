public class MinimumPathSumRightDown {
    static int min;
    public static void main(String[] args) {
        min=Integer.MAX_VALUE;
        int arr[][]={{1,4,3},
                     {5,7,6},
                     {1,2,8}};
        pathsum(arr,0,0,arr[arr.length-1][arr.length-1]);
        System.out.println(min);
    }
    public static void pathsum(int arr[][],int r,int c,int sum)
    {
        if(r==arr.length-1&&c==arr.length-1)
        {
            min=Math.min(sum,min);
            return;
        }
        if(r>=arr.length||c>=arr.length)return;
        pathsum(arr, r+1, c, sum+arr[r][c]);
        pathsum(arr, r, c+1, sum+arr[r][c]);
    }
}
