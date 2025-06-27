public class MinMax{
    public static void main(String[] args) {
        int arr[]={23,12,45,64,34,12,-9};
        System.out.println("Max = "+getMax(arr,arr[0],1));
        System.out.println("Min = "+getMin(arr,arr[0],1));
    }
    public static int getMax(int arr[],int max,int i)
    {
        if(i==arr.length)return max;
        return Math.max(max,getMax(arr, arr[i], i+1));
    }
        public static int getMin(int arr[],int max,int i)
    {
        if(i==arr.length)return max;
        return Math.min(max,getMin(arr, arr[i], i+1));
    }
}
