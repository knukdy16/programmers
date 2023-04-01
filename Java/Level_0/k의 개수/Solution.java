class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int index = i; index <= j; index++) {
            String temp = Integer.toString(index);
            answer += temp.length() - temp.replace(Integer.toString(k), "").length();
        }
        
        return answer;
    }
}