class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[][] ary = new int[6][2];
        
        int index = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = i + 1; j < 4; j++) {
                ary[index][0] = Math.abs(dots[i][0] - dots[j][0]);
                ary[index][1] = Math.abs(dots[i][1] - dots[j][1]);
                index++;
            }
        }
        
        for(int i = 0; i < ary.length; i++) {
            for(int j = i + 1; j < ary.length; j++) {
                if(ary[i][1] * ary[j][0] == ary[j][1] * ary[i][0]) { answer = 1; break; }
            }
        }
        
        return answer;
    }
}