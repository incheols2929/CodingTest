package book.수정렬하기1;

import java.util.Scanner;

/*
 *  https://www.youtube.com/watch?v=MP9WJpngMvY&list=PLFgS-xIWwNVU_qgeg7wz_aMCk22YppiC6&index=11
 *  1. 정렬 알고리즘을 이용하여 풀어야함.
 *  2. 버블정렬 알고리즘을 이용.
 *  */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        //버블 정렬을 구하는 영역
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }

    }
}
