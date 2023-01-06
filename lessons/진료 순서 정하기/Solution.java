class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int min;
        for(int i = 0; i < emergency.length; i++ ) {
            min = 1;
            for(int j = 0; j < emergency.length; j++) {
                if(emergency[i] < emergency[j]) min++;
            }
            answer[i] = min;
        }
        
        return answer;
    }
}