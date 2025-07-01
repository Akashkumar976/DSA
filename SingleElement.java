import java.util.HashMap;

public class SingleElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3,4,7,8,8};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int t:arr)
        {
            map.put(t,map.getOrDefault(t,0)+1);
        }
        int ans=0;
        for(int t:map.keySet()){
            if(map.get(t)==1)
            {
                ans=t;break;
            }
        }
        System.out.println(ans);
    }
}
