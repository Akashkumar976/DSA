import java.util.Arrays;
public class RightSide {
    public static void main(String[] args) {
    int arr[]={12,0,1,23,12,0,45,0};
    int max=0;
    if(arr[arr.length-1]%2!=0)max=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--)
    {
        if(arr[i]==0)
        {
           arr[i]=max;
        }
        else if(arr[i]%2!=0)
        {
            max=Math.max(arr[i],max);
        }
    }
   System.out.println(Arrays.toString(arr));
}

}
