public class MinPathSum {
    public static void main(String[] args) {
        int arr[][]={{1,3,1},{1,5,1},{4,5,1}};
        System.out.println(Sumpath(arr,0,0));
    }
    public static int Sumpath(int arr[][],int r,int d)
    {
      
          if(r>=arr[0].length||d>=arr.length)
        {
            return  Integer.MAX_VALUE;
        }
                if(r==arr[0].length-1 && d==arr.length-1)
                {
                    return arr[d][r];
                }

        int x=Sumpath(arr, r+1, d);
        int y=Sumpath(arr, r, d+1);
       
        return arr[d][r]+Math.min(x,y);
    }
}
