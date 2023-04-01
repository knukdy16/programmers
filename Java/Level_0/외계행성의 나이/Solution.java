class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            String temp = my_string.substring(i, i + 1);
            answer += ((int) temp.charAt(0) > 96 ? temp.toUpperCase() : temp.toLowerCase());
        }
        
        return answer;
    }
}