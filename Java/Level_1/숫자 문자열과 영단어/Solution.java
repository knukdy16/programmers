class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] ary = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < ary.length; i++) {
            s = s.replace(ary[i], Integer.toString(i));
        }
        
        answer = Integer.valueOf(s);
        
        return answer;
    }
}