import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
  //  int arr[]={998,36456,2,4,3,1,9,3,78};
    int arr[]={9,8,7,6,5,4,3,2,1};         for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    int t=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }
                else{
                    break;
                }
            }
         }System.out.println(Arrays.toString(arr));
    }
    
}
