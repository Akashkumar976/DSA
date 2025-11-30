import java.util.ArrayList;
import java.util.Collections;

public class DigitSum {
    public static void main(String[] args) {
        int arr[] = {4, 6, 5, 6, 7};
        int arr1[] = {5, 6, 7, 3, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;
        int i = arr.length - 1;
        int j = arr1.length - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += arr[i];
            if (j >= 0) sum += arr1[j];
            ans.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        while(carry>0)
        {
        ans.add(carry%10);
        carry/=10;
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
