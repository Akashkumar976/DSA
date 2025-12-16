import java.util.*;

class Solution3562 {

    int maxBudget;
    List<Integer>[] children;
    int[] buyPrice, sellPrice;
    int[][][] memo; // memo[node][parentPurchased][cost]

    public int maxProfit(int n, int[] present, int[] future,
                         int[][] hierarchy, int budget) {

        this.maxBudget = budget;
        this.buyPrice = present;
        this.sellPrice = future;

        children = new ArrayList[n];
        for (int i = 0; i < n; i++)
            children[i] = new ArrayList<>();

        for (int[] edge : hierarchy) {
            children[edge[0] - 1].add(edge[1] - 1);
        }

        memo = new int[n][2][maxBudget + 1];

        computeDP(0);

        int result = 0;
        for (int cost = 0; cost <= maxBudget; cost++) {
            result = Math.max(result, memo[0][0][cost]);
        }
        return result;
    }

    private int[] combineKnapsack(int[] first, int[] second) {
        int[] combined = new int[maxBudget + 1];
        Arrays.fill(combined, Integer.MIN_VALUE / 2);

        for (int i = 0; i <= maxBudget; i++) {
            if (first[i] < 0) continue;
            for (int j = 0; i + j <= maxBudget; j++) {
                combined[i + j] = Math.max(combined[i + j], first[i] + second[j]);
            }
        }
        return combined;
    }

    private void computeDP(int node) {
        for (int child : children[node]) {
            computeDP(child);
        }

        for (int parentPurchased = 0; parentPurchased <= 1; parentPurchased++) {

            int costToBuy = parentPurchased == 1
                    ? buyPrice[node] / 2
                    : buyPrice[node];

            int netProfit = sellPrice[node] - costToBuy;

            int[] notBuy = new int[maxBudget + 1];
            for (int child : children[node]) {
                notBuy = combineKnapsack(notBuy, memo[child][0]);
            }

            int[] buy = new int[maxBudget + 1];
            Arrays.fill(buy, Integer.MIN_VALUE / 2);

            if (costToBuy <= maxBudget) {
                int[] childBase = new int[maxBudget + 1];
                for (int child : children[node]) {
                    childBase = combineKnapsack(childBase, memo[child][1]);
                }
                for (int b = costToBuy; b <= maxBudget; b++) {
                    buy[b] = childBase[b - costToBuy] + netProfit;
                }
            }

            for (int b = 0; b <= maxBudget; b++) {
                memo[node][parentPurchased][b] = Math.max(notBuy[b], buy[b]);
            }
        }
    }
}
