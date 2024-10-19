class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result = String.valueOf(a) + String.valueOf(b);   
        long sum1 = Long.parseLong(result);
        long sum2 = 2L * a * b;
        
                
        if(sum1 < sum2){
            answer = (int) sum2;
        } else{
            answer = (int) sum1;
        }
        
        return answer;
    }
}