class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int total = 0;
        int sum = 1;
        for(int num : num_list){
            total+=num;
        }
        int totals = total*total;
        
        for(int num : num_list){
            sum*=num;
        }
        if(sum < totals){
            answer = 1;
        }else{
            answer = 0;
        }
               
        
        return answer;
    }
}