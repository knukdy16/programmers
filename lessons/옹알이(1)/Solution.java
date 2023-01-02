class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] checker = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            int len = 0;
            for(int j = 0 ; j < checker.length; j++) {
                babbling[i] = babbling[i].replace(checker[j],"1");
            }
            if(babbling[i].matches("^[1]*$")) answer++;
        }
        
        return answer;
    }
}