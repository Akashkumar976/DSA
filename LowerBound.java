public class LowerBound {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,9,10};
        int key=8;
        int i=0,j=arr.length-1;
        int ans=0;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr[mid]>=key)
            {
               ans=mid;
               j=mid;
            }
            else{
                i=mid+1;
            }
        }
        System.out.println(arr[ans]);
    }
}
