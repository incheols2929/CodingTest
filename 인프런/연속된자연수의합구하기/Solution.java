package 인프런.연속된자연수의합구하기;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 투포인터 이용
 * */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);

    }
}
