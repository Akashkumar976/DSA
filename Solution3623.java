import java.util.*;

public class Solution3623 {
    public int countTrapezoids(int[][] points) {
        long MOD = 1_000_000_007;

        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int arr[]: points) {
            if(!map.containsKey(arr[1])) {
                HashSet<Integer> st = new HashSet<>();
                map.put(arr[1], st);
            }
            map.get(arr[1]).add(arr[0]);
        }

        List<Long> list = new ArrayList<>();
        for(int y: map.keySet()) {
            long s = map.get(y).size();
            if(s >= 2) list.add(s * (s - 1) / 2);
        }

        long ans = 0;
        long pref = 0;

        for(long v : list) {
            ans = (ans + v % MOD * pref % MOD) % MOD;
            pref = (pref + v) % MOD;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        LC3623 obj = new LC3623();

        int[][] points1 = {
            {1,0},{2,0},{3,0},{2,2},{3,2}
        };

        int[][] points2 = {
            {0,0},{1,0},{0,1},{2,1}
        };

        System.out.println(obj.countTrapezoids(points1));  // 3
        System.out.println(obj.countTrapezoids(points2));  // 1
    }
}
