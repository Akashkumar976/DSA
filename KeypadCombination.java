import java.util.*;

public class KeypadCombination {
    public static String keys[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    static void printKPC(String ques) {
        cmb(ques, 0, "");
    }
    public static void cmb(String s, int i, String ans) {
        if (i >= s.length()) {
            System.out.println(ans);
            return;
        }
        String t = keys[s.charAt(i) - '0'];
        for (int j = 0; j < t.length(); j++) {
            cmb(s, i + 1, ans + t.charAt(j));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printKPC(str);
    }
}
