import java.util.*;
public class CombinationSum {
    static ArrayList<ArrayList<Integer>>ans;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:-");
        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter the elements:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum:-");
        int t=sc.nextInt();
        ans=new ArrayList<>();
        Arrays.sort(arr);
        cmb(arr,t,0,0,new ArrayList<>());
        System.out.println("combinations are:-\n"+ans);
        sc.close();
    }
    public static void cmb(int arr[],int t,int sum,int id,ArrayList<Integer>res)
    {
        if(sum==t)
        {
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=id;i<arr.length;i++)
        {
            if(sum+arr[i]<=t)
            {
                res.add(arr[i]);
                cmb(arr, t, sum+arr[i], i+1, res);
                res.remove(res.size()-1);
            }
        }
    }
}
