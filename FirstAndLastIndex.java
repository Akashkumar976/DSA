public class FirstAndLastIndex {
    public static void main(String[] args) {
        int arr[]={11,13,14,24,24,24,24,24,24,24,24,24,24,24,24,24,34,55,66,77,98,99,101,102,201,202};
        int ele=2;
        int first=FirstIndex(arr,ele);
        int last=LastIndex(arr,ele);
            System.out.println("The First index of "+ele+" is "+ ++first+" and Last Index is "+ ++last+".");
    }
    public static int FirstIndex(int arr[],int key)
    {
        int s=0,e=arr.length-1,ans=0;
        while(s<e)
        {
            int mid=(s+e)/2;
            if(arr[mid]>=key)
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }

        }
                if(arr[ans]!=key)ans=-1;
        return ans;
    }
public static int LastIndex(int arr[],int key)
    {
        int s=0,e=arr.length-1,ans=0;
        while(s<e)
        {
           int mid=(s+e)/2;
           if(arr[mid]<=key)
           {
            s=mid+1;
            ans=mid;
           }
           else 
           {
              e=mid-1;
           }

        }
        if(arr[ans]!=key)ans=-1;
        return ans;
    }
}
