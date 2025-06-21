public class BubbleSort {
    public static void main(String[] args) {
         int arr[]={998,36456,2,4,3,1,9,3,78};
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr.length-i-1;j++)
          {
              if(arr[j+1]<arr[j])
              {
                  int te=arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=te;
              }
          }
      }
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
    }
}
