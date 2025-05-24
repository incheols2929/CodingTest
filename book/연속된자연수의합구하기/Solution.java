package book.연속된자연수의합구하기;
/* https://www.youtube.com/watch?v=ZovjkF2DzIs&list=PLFgS-xIWwNVU_qgeg7wz_aMCk22YppiC6&index=4 */
/* 1. 투 포인터
 * 2.
 *
 *
 * */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index  != N){
            if(sum == N){
                count++;
                end_index++;
                sum = sum+ end_index;
            }else if(sum > N){
                sum = sum - start_index;
                start_index++;
            }else{
                end_index++;
                sum = sum+ end_index;
            }
        }
        System.out.println(count);

    }
}
