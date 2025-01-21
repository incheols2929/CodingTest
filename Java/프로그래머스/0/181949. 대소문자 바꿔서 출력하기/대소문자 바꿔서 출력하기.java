import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        /*for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(c);
            }
        }*/
         for(char c : a.toCharArray()){
             sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
         }
         System.out.println(sb.toString());
    }
}