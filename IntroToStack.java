import java.util.Stack;

public class IntroToStack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(23);st.push(45);st.push(76);
        System.out.println(st.toString());
        System.out.println("Peek:-"+st.peek());
        st.pop();
        System.out.println(st.toString());
        System.out.println("Size:- "+st.size());
    }
}
