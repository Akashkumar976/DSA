import java.util.ArrayList;
import java.util.Collections;

public class Subsequence {
   public static ArrayList<String>ans;
    public static void main(String[] args) {
        ans=new ArrayList<>();
        sunsequence("abc",0,"");
        Collections.sort(ans);
         System.out.println(ans);
    }
    public static void sunsequence(String s,int i,String t){
        if(i==s.length())
        {
ans.add(t);
return;        
}
                    sunsequence(s, i+1, t);
                        sunsequence(s, i+1, t+s.charAt(i));




    }
}

