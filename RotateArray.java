public class RotateArray {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};//34562  34512
        int k=2;
                rotate(arr,0,arr.length-1);

        rotate(arr,0,k-1);
        rotate(arr,k,arr.length-1);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int arr[],int i,int j)
    {
        // while(k>0)
        // {
        //                 k--;   
        //     int temp=arr[0];
        //     for(int j=1;j<arr.length;j++)
        //     {
        //         arr[j-1]=arr[j];
        //     }
        //     arr[arr.length-1]=temp;
        // }
    while (i<j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }

}
}
