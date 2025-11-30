import java.util.Arrays;

public class Range {
 public static void main(String[] args) {
int arr[]={101,456,34,3445,98,98,106,156,149,169,600};
    int st=120,e=1250;
    Arrays.sort(arr);
    int x=firstfinder(arr,st);
    int y=lastfinder(arr, e);
    System.out.println("Sorted array:-"+Arrays.toString(arr));
    System.out.println("The number of elements  lies in the  given range are:- "+(y-x+1)+" Start element:- "+arr[x]+" End "+arr[y]);
 }   
 public static int firstfinder(int arr[],int st)
 {
    int s=0,e=arr.length-1,ans=-1;
    while(s<=e)
    {
        int mid=((e+s)/2);
        if(arr[mid]>st)
        {  
             ans=mid;
            e=mid-1;
\        }
       else 
        {
            s=mid+1;
        }

    }
    return ans;
 }
  public static int lastfinder(int arr[],int st)
 {
    int s=0,e=arr.length-1,ans=-1;
    while(s<=e)
    {
        int mid=((e+s)/2);
        if(arr[mid]<st)
        {
            ans=mid;
            s=mid+1;
        }
       else 
        {
            e=mid-1;
        }

    }
    return ans;
 }
}
