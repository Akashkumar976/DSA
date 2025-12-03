class Solution4025 {
    public int countTrapezoids(int[][] pts) {
        int n = pts.length;
        double BIG = 1e9 + 7;

        Map<Double, List<Double>> k2b = new HashMap<>();
        Map<Integer, List<Double>> mid2k = new HashMap<>();

        int out = 0;

        for (int a = 0; a < n; a++) {
            int x1 = pts[a][0], y1 = pts[a][1];

            for (int b = a + 1; b < n; b++) {
                int x2 = pts[b][0], y2 = pts[b][1];

                int dx = x1 - x2;
                int dy = y1 - y2;

                double k, bb;

                if (x1 == x2) {
                    k = BIG;
                    bb = x1;
                } else {
                    k = 1.0 * (y2 - y1) / (x2 - x1);
                    bb = 1.0 * (y1 * dx - x1 * dy) / dx;
                }

                if (k == -0.0) k = 0.0;
                if (bb == -0.0) bb = 0.0;

                int mid = (x1 + x2) * 10000 + (y1 + y2);

                k2b.computeIfAbsent(k, z -> new ArrayList<>()).add(bb);
                mid2k.computeIfAbsent(mid, z -> new ArrayList<>()).add(k);
            }
        }

        for (List<Double> lst : k2b.values()) {
            if (lst.size() == 1) continue;

            Map<Double, Integer> freq = new TreeMap<>();
            for (double v : lst) freq.put(v, freq.getOrDefault(v, 0) + 1);

            int pre = 0;
            for (int c : freq.values()) {
                out += pre * c;
                pre += c;
            }
        }

        for (List<Double> lst : mid2k.values()) {
            if (lst.size() == 1) continue;

            Map<Double, Integer> freq = new TreeMap<>();
            for (double v : lst) freq.put(v, freq.getOrDefault(v, 0) + 1);

            int pre = 0;
            for (int c : freq.values()) {
                out -= pre * c;
                pre += c;
            }
        }

        return out;
    }
}
