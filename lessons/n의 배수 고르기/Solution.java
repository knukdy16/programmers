class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                int[] temp = new int[answer.length + 1];
                int j;
                for(j = 0; j < answer.length; j++) { temp[j] = answer[j]; }
                temp[j] = numlist[i];
                answer = temp;
            }
        }
        
        return answer;
    }
}