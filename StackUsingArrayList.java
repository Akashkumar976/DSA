import java.util.ArrayList;

public class StackUsingArrayList {
    public static ArrayList<Integer>st;
     public static void push(int x)
    {
        st.add(x);
    }
    public static void display()
    {
        System.out.println(st.toString());
    }
    public static int pop()
    {
                if(st.size()>0)
        return st.remove(st.size()-1);
                return -1;
    }
    public static int peek()
    {
        if(st.size()>0)
        return st.get(st.size()-1);
        return -1;
    }
    public static int size()
    {
        return st.size();
    }
    public static void main(String[] args) {
        st=new ArrayList<>();
        push(45);
        push(78);
        push(90);
        display();
        pop();
         display();
         System.out.println(peek());
    }
   
}
