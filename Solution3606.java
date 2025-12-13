class Solution3606 {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String>ans=new ArrayList<>();
                List<String>st=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<code.length;i++)
        {
            if( isActive[i]  && !businessLine[i].equals("invalid") && isvalid(code[i]))
            {
                if(!map.containsKey(businessLine[i]))
                {
                    map.put(businessLine[i],new ArrayList<>());
                    st.add(businessLine[i]);
                }
                map.get(businessLine[i]).add(code[i]);
              }
        }
        Collections.sort(st);
        for(String m:st)
        {
            if(map.containsKey(m))
            {
                Collections.sort(map.get(m));
                for( String n:map.get(m))
                {
                    ans.add(n);
                }
            }
        }
        return ans;
    }
    public static boolean isvalid(String s)
    {
        if(s.isEmpty())return false;
       for(char c:s.toCharArray())
       {  if(c=='_')continue;
          if(!Character.isDigit(c))
          {
            char t=Character.toLowerCase(c);
            if(t<'a'||t>'z')return false;
          }
       }
      return true;
    }
}