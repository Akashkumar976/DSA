public class CountOccurence {
    public static void main(String[] args) {
        System.out.println(occurence(77877707,7));
    }
public static int occurence(int n,int x)
{
    if(n==0)return 0;
    
    int c=0;
    if(n%10==7)c=1;
    return c+occurence(n/10, x);
}
    
}
