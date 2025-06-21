public class IntoductionToStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.insert(0,"Welcome ");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.err.println(sb);
        sb.delete(0,7);
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        // System.out.println(sb.reverse());
        rev(sb);
        
    }
    public static void rev(StringBuilder sb)
    {
        // int s=0,e=sb.length()-1;
        // while(s<e)
        // {
        //     char c=sb.charAt(s);
        //     sb.setCharAt(s, sb.charAt(e));
        //     sb.setCharAt(e,c);
        //     s++;
        //     e--;
        // }
        for (int i = 0; i <=sb.length()/2; i++) {
            char c=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1,c);
        }
        System.out.println(sb);
    }
}
