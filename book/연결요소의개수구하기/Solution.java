package book.연결요소의개수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * DFS사용 재귀형식으로 구현
 *   https://www.youtube.com/watch?v=Y2kHlj7xqfU&list=PLFgS-xIWwNVU_qgeg7wz_aMCk22YppiC6&index=13
 *
 * */
public class Solution {
    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n + 1];
        A = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i < m + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (!visited[i]) {//방문하지않은 노드가 있다면
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
