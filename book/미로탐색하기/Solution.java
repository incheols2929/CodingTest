package book.미로탐색하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 * https://www.youtube.com/watch?v=2QVfsI55AVo&list=PLFgS-xIWwNVU_qgeg7wz_aMCk22YppiC6&index=14
 *   1. DFS, BFS 둘다 사용이 가능함.
 *   2. 완전탐색
 *   3. BFS 는 Queue로 구현
 * */
public class Solution {
    //아래를 탐색 , 오른쪽으로 탐색, 위를 탐색, 왼쪽을 탐색
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static boolean[][] visited;
    static int[][] A;
    static int N;
    static int M;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken(); // 1011010101
            for (int j = 0; j < M; j++) {
                /*한칸씩 잘라서 A배열에 넣음*/
                A[i][j] = Integer.parseInt(line.substring(j, j + 1));
            }
        }
        BFS(0, 0);
        System.out.println(A[N - 1][M - 1] - 1);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int now[] = queue.poll();
            for (int k = 0; k < 4; k++) {
                /* dx,dy 부분 상하좌우 탐색*/
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < M) {   //배열을 넘어가면 안되고
                    if (A[x][y] != 0 && !visited[x][y]) {   //0이여서 갈수 없거나 기 방문한 곳이면안됨.
                        //이제 갈 수 있는 곳이다.
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1; // 핵심
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
