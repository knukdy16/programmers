class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            int temp = arr1[i] | arr2[i];
            answer[i] = "";
            
            for(int j = 0; j < n; j++) {
                if(temp % 2 == 0) answer[i] = " " + answer[i];
                else answer[i] = "#" + answer[i];
                temp /= 2;
            }
            
        }
        return answer;
    }
}