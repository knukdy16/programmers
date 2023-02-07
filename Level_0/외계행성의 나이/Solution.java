class Solution {
    public String solution(int age) {
        String answer = "";
        for(int i = 0; i < 4; i++) {
            answer = (char) (age % 10 + 97) + answer;
            age /= 10;
            if(age == 0) break;
        }
        return answer;
    }
}