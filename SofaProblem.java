import java.util.*;

public class SofaProblem {
    static class State {
        int r, c, o, st;
        State(int r, int c, int o, int st) {
            this.r = r; this.c = c; this.o = o; this.st = st;
        }
    }

    static int M, N;
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();

        arr = new char[M][N];

        List<int[]> startCells = new ArrayList<>();
        List<int[]> endCells = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.next().charAt(0);
                if (arr[i][j] == 's') startCells.add(new int[]{i, j});
                if (arr[i][j] == 'S') endCells.add(new int[]{i, j});
            }
        }

        int sr1 = startCells.get(0)[0], sr2 = startCells.get(1)[0];
        int sc1 = startCells.get(0)[1], sc2 = startCells.get(1)[1];
        int srow = Math.min(sr1, sr2);
        int scol = Math.min(sc1, sc2);
        int startOrient = (sr1 == sr2) ? 0 : 1;

        int er1 = endCells.get(0)[0], er2 = endCells.get(1)[0];
        int ec1 = endCells.get(0)[1], ec2 = endCells.get(1)[1];
        int erow = Math.min(er1, er2);
        int ecol = Math.min(ec1, ec2);
        int endOrient = (er1 == er2) ? 0 : 1;

        int ans = bfs(srow, scol, startOrient, erow, ecol, endOrient);
        System.out.println(ans == -1 ? "Impossible" : ans-1);

        sc.close();
    }

    static int bfs(int sr, int sc, int so, int er, int ec, int eo) {
        boolean[][][] visited = new boolean[M][N][2];
        Queue<State> q = new ArrayDeque<>();
        q.add(new State(sr, sc, so, 0));
        visited[sr][sc][so] = true;

        while (!q.isEmpty()) {
            State cur = q.poll();

            if (cur.r == er && cur.c == ec && cur.o == eo)
                return cur.st;

            int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
            for (int[] d : dirs) {
                int nr = cur.r + d[0];
                int nc = cur.c + d[1];
                if (canMove(nr, nc, cur.o) && !visited[nr][nc][cur.o]) {
                    visited[nr][nc][cur.o] = true;
                    q.add(new State(nr, nc, cur.o, cur.st + 1));
                }
            }

            int newOrient = 1 - cur.o;
            if (canRotate(cur.r, cur.c) && !visited[cur.r][cur.c][newOrient]) {
                visited[cur.r][cur.c][newOrient] = true;
                q.add(new State(cur.r, cur.c, newOrient, cur.st + 1));
            }
        }

        return -1;
    }

    static boolean canMove(int r, int c, int orient) {
        if (orient == 0) { 
            if (r < 0 || r >= M || c < 0 || c + 1 >= N) return false;
            return isFree(r, c) && isFree(r, c + 1);
        } else { 
            if (r < 0 || r + 1 >= M || c < 0 || c >= N) return false;
            return isFree(r, c) && isFree(r + 1, c);
        }
    }

    static boolean canRotate(int r, int c) {
        if (r < 0 || r + 1 >= M || c < 0 || c + 1 >= N) return false;
        return isFree(r, c) && isFree(r + 1, c) && isFree(r, c + 1) && isFree(r + 1, c + 1);
    }

    static boolean isFree(int r, int c) {
        if (r < 0 || r >= M || c < 0 || c >= N) return false;
        return arr[r][c] == '0' || arr[r][c] == 's' || arr[r][c] == 'S';
    }
}
