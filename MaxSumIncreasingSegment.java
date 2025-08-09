import java.util.Scanner;
import java.util.Stack;

public class MaxSumIncreasingSegment {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[sc.nextInt()];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    long msum=0;
    Stack<Integer>st=new Stack<>();
    for(int t:arr)
    {
     if(!st.isEmpty()&&st.peek()>=t)
     {
        long sum=0;
        while(!st.isEmpty())sum+=st.pop();
        msum=Math.max(msum,sum);
     }
     st.push(t);
    }
    long x=0;
    while(!st.isEmpty())x+=st.pop();
    System.out.println(Math.max(x,msum));

 }   
}
