import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String s="abs def ghi jkl mno";
        String arr[]=s.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3].length());
    }
}
