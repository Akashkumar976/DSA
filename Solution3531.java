import java.util.*;

class Solution3531 {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, Integer> minY = new HashMap<>();
        Map<Integer, Integer> maxY = new HashMap<>();
        Map<Integer, Integer> minX = new HashMap<>();
        Map<Integer, Integer> maxX = new HashMap<>();
        
        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            minY.put(x, Math.min(minY.getOrDefault(x, n+1), y));
            maxY.put(x, Math.max(maxY.getOrDefault(x, 0), y));
            minX.put(y, Math.min(minX.getOrDefault(y, n+1), x));
            maxX.put(y, Math.max(maxX.getOrDefault(y, 0), x));
        }
        
        Set<String> buildingSet = new HashSet<>();
        for (int[] b : buildings) {
            buildingSet.add(b[0] + "," + b[1]);
        }
        
        int count = 0;
        
        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            
            boolean hasLeft = minY.get(x) < y;
            boolean hasRight = maxY.get(x) > y;
            boolean hasUp = minX.get(y) < x;
            boolean hasDown = maxX.get(y) > x;
            
            if (hasLeft && hasRight && hasUp && hasDown) {
                count++;
            }
        }
        
        return count;
    }
}
