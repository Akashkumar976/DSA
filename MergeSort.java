import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={23,12,4,5,81,1};
         mergeSort(0,arr.length-1,arr);
         System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int i,int j,int arr[])
    {
        if(i<j)
        {
            int mid=(i+j)/2;
            mergeSort(i, mid, arr);
            mergeSort(mid+1, j, arr);
            Merge(i,mid,j,arr);
        }
    }
    public static void Merge(int i,int mid,int j,int arr[])
    {
      int n1=mid-i+1;
      int n2=j-mid;
      int  l[]=new int[n1];
      int r[]=new int[n2];
      for(int k=0;k<n1;k++)
      {
        l[k]=arr[i+k];
      }
      for(int k=0;k<n2;k++)
      {
        r[k]=arr[mid+k+1];
      }
      int s=0,e=0,id=i;
      while(s<n1&&e<n2)
      {
        if(l[s]<r[e])
        {
            arr[id++]=l[s++];
        }
        else
        {
            arr[id++]=r[e++];
        }
      }
      while(s<n1)
      {
                    arr[id++]=l[s++];

      }
      while(e<n2)
      {
                    arr[id++]=r[e++];

      }
    }
}