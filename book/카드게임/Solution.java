package book.카드게임;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *  1. 큐에 대한 문제 / 선입선출
 * https://www.youtube.com/watch?v=624DWEXSehw&list=PLFgS-xIWwNVU_qgeg7wz_aMCk22YppiC6&index=10
 * */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }
        while(myQueue.size() > 1){
            myQueue.poll();
            int temp = myQueue.poll();
            myQueue.add(temp);
        }
        System.out.println(myQueue.poll());
    }
}
