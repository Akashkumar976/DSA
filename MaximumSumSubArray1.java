public class MaximumSumSubArray1 {
    public static void main(String[] args) {
        int[] a ={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum=Math.max(sum+a[i],a[i]);
            max=Math.max(max,sum);
        }
        System.out.println("hello");


    }
}