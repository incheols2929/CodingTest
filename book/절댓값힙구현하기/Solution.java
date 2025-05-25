package book.절댓값힙구현하기;

/*
 * 1. 우선순위 큐로 문제를 풀어야함.
 *
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if (first_abs == second_abs) { /* 절대 값이 같은 경우 음수 우선*/
                return o1 > o2 ? 1 : -1; //양수 리턴 / 음수 리턴
            }
            return first_abs - second_abs; /* 절대 값 작은데이터 우선 */
        });
        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (myQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(request);
            }
        }
    }
}
