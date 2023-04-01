class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-z]+", " ");
        if(my_string.charAt(0) == ' ') my_string = my_string.substring(1, my_string.length());
        String[] splited = my_string.split(" ");
        
        try {
            for(int i = 0; i < splited.length; i++) {
                answer += Integer.valueOf(splited[i]);
            }
        } catch(Exception e) { return 0; }
        
        return answer;
    }
}