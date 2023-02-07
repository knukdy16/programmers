class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-z]+", " ");
        String[] splited = my_string.split(" ");
        
        for(int i = 0; i < splited.length; i++) {
            if(!splited[i].equals("")) answer += Integer.valueOf(splited[i]);
        }
        
        return answer;
    }
}