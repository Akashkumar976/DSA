public class StairCostSum {
    public static void main(String[] args) {
        int arr[]={5,3,4,8,9,1,5,1,1,5,3,3,1};
        int c1=arr[0];
        int c2=arr[1];
        for (int i = 2; i < arr.length; i++) {
            int curr=arr[i]+Math.min(c1,c2);
            c1=c2;
            c2=curr;
        }
        System.out.println("Answer is:-"+Math.min(c1,c2));
    }
}
