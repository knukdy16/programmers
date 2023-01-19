class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String str = Integer.toString(num);
        
        for(int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(temp == (char) (48 + k)) { answer = i + 1; break; }
        }
        
        return answer;
    }
}