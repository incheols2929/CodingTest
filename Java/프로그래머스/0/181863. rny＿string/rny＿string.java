class Solution {
    public String solution(String rny_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rny_string.length(); i++) {
            if(rny_string.charAt(i) == 'm'){
                sb.append("rn");
            }else{
                sb.append(rny_string.charAt(i));
            }
        }
        answer = sb.toString();
        System.out.println(answer);
        return answer;
    }
}