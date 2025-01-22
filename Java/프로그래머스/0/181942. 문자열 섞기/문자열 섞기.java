class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str1.length(); i++) {
            builder.append(str1.charAt(i));
            builder.append(str2.charAt(i));
        }
        answer = builder.toString();
        System.out.println(answer);
        return answer;
    }
}