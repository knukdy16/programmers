class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z|A-Z]", "");
        
        for(int i = 0; i < my_string.length(); i++) {
            answer += Integer.valueOf(my_string.substring(i, i + 1));
        }
        
        return answer;
    }
}