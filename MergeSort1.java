import java.util.Arrays;
public class MergeSort1 {
    public static void main(String[] args) {
        int arr[]={4,3,2,6,7,1,8,9,12,11,-23};
        MergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void MergeSort(int arr[],int s,int e)
    {  
        if(s<e)
        {
        int mid=(e+s)/2;
        MergeSort(arr, s, mid);
        MergeSort(arr,mid+1, e);
        Merge(arr,s,mid,e);
        }else return;
    }
    public static void Merge(int arr[],int s,int mid,int e)
    {
        int n1=mid-s+1;
        int n2=e-mid;
int left[]=new int[n1];
int right[]=new int[n2];
for(int i=0;i<n1;i++)
{
    left[i]=arr[s+i];
}
for(int i=0;i<n2;i++)
{
    right[i]=arr[mid+i+1];
}
  int i=0,j=0;
  while(i<n1 && j<n2)
  {
    if(left[i]<right[j])
    {
        arr[s++]=left[i++];
    }
    else{
        arr[s++]=right[j++];
    }
  }
  while(i<n1)
  {
            arr[s++]=left[i++];
  }
  while(j<n2)
  {
            arr[s++]=right[j++];
  }
    }
}
