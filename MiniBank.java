import java.util.*;

public class MiniBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), n = sc.nextInt();
        sc.nextLine();

        List<Integer> t = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] op = sc.nextLine().split(" ");
            switch(op[0]) {
                case "read" -> System.out.println(b);
                case "credit" -> {
                    int v = Integer.parseInt(op[1]);
                    b += v; t.add(v); a.add(v);
                }
                case "debit" -> {
                    int v = Integer.parseInt(op[1]);
                    b -= v; t.add(-v); a.add(-v);
                }
                case "abort" -> {
                    int idx = Integer.parseInt(op[1]) - 1;
                    if (idx >= totalCommittedTx(c, a) && idx < a.size()) {
                        int v = a.get(idx);
                        b -= v; t.remove(Integer.valueOf(v)); a.set(idx, 0);
                    }
                }
                case "commit" -> { c.add(b); t.clear(); }
                case "rollback" -> {
                    int idx = Integer.parseInt(op[1]) - 1;
                    if (idx >= 0 && idx < c.size()) { b = c.get(idx); t.clear(); }
                }
            }
        }

        sc.close();
    }

    static int totalCommittedTx(List<Integer> c, List<Integer> a) {
        int cnt = 0, sum = 0;
        for (int v : a) { if (v != 0) cnt++; if (cnt <= c.size()) sum++; }
        return sum;
    }
}
