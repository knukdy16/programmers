class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        
        for(int i = max - min + 1; max < min + i && i <= max; i++) answer++;
        for(int i = max + 1; i < max + min ; i++) answer++;
        
        return answer;
    }
}