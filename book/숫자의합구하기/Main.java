package book.숫자의합구하기;/* 1. n의 범위가 1부터 100까지이므로 값을 int형, long형을 받지 못함.String으로만 받아야함.
 * 2. toCharArray 함수를 사용하여 배열로 변환
 * 3. 문자열을 숫자형으로 변환 -> 문자를 숫자형으로 변경하려면 아스키코드를 사용해야 함.
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}