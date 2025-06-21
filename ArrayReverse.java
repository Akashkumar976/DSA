public class ArrayReverse {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,7};
reverse(arr);
    for (int k = 0; k < arr.length; k++) {
        System.out.print(arr[k]+" ");
    }
}
    public static void reverse(int arr[])
    {
 int j=arr.length-1;
    int i=0;
    while (i<j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        
    }
    }
}
