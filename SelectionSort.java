public class SelectionSort {
    public static void main(String[] args) {
        
    //  int arr[]={998,36456,2,4,3,1,9,3,78};
    int arr[]={9,8,7,6,5,4,3,2,1};
      for(int i=0;i<arr.length;i++)
      {
        int min=i;
          for(int j=i+1;j<arr.length;j++)
          {
              if(arr[j]<arr[min])
              {
                  min=j;
              }
              
          }
          int te=arr[min];
                  arr[min]=arr[i];
                  arr[i]=te;
      }
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
    }
}
