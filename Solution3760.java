class Solution3760 {
    public int maxDistinct(String s) {
    int max=0;
    boolean count[]=new boolean[26];
    for(char c:s.toCharArray())
    {
        if(!count[c-'a'])
        {max++;
        count[c-'a']=true;
        }
    }
    return max;
    }
}