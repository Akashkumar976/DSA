import java.util.HashMap;

public class DuplicateElements {
    public static void main(String args[])
    {
        int arr[]={2,3,4,2,3,5,6,7,4,5,6,7,5,3,9};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int t:arr)
        {
            map.put(t,map.getOrDefault(t,0)+1);
        }
        for(int t:map.keySet())
        {
            if(map.get(t)>1)
            System.out.print(t+" ");
        }
    }
    
}
