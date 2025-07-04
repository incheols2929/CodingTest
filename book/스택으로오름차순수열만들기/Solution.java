package book.스택으로오름차순수열만들기;

import java.util.Scanner;
import java.util.Stack;

/*
 * https://www.youtube.com/watch?v=vf-i7Q_fN6w&list=PLFgS-xIWwNVU_qgeg7wz_aMCk22YppiC6&index=8
 * 1. 스택의 원리 -> FILO 후입선출 개념
 * 2. 오름차순
 *
 * */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < A.length; i++) {
            int su = A[i];
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
    }
}
