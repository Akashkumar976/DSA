public class CyclePattern {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,67},{5,6,7,8,76},{9,10,11,12,78},{13,14,15,16,79},{17,18,19,20,21}};
        int left=0,right=arr[0].length-1,top=0,down=arr.length-1;
        while(top<down||left<right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(arr[top][i]+" ");
            }
            top++;

                for(int i=top;i<=down;i++)
                {
                    System.out.print(arr[i][right]+" ");
                }
                right--;
              if(top<=down)
              {
            for(int i=right;i>=left;i--)
            {
              System.out.print(arr[down][i]+" ");  
            }
            down--;
        }
   if(left<=right)
   {
                 for(int i=down;i>=top;i--)
                {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }

    }
}
