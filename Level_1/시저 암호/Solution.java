class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i);
            if(temp != 32) temp += n;
            if((temp > 90 && (temp - n) <= 90) || temp > 122) temp -= 26;
            answer += (char) temp;
        }
        
        return answer;
    }
}