public class NumberConverter {
    public static void main(String[] args) {
        int n=4565;
        int base=8;
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
        if(n%base<10)
           sb.append(n%base);
        else
        {
                sb.append((char)('A' + ((n%base) - 10)));
        }
           n/=base;
        }
        System.out.println(sb.reverse().toString());
    }
}
