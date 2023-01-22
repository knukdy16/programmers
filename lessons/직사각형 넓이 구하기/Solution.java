class Solution {
    public int solution(int[][] dots) {
        
        int row = 0;
        int column = 0;
        for(int i = 0; i < dots.length; i++) {
            if(dots[0][0] != dots[i][0]) {
                row = Math.abs(dots[0][0] - dots[i][0]);
                break;
            }
        }
        
        for(int i = 0; i < dots.length; i++) {
            if(dots[0][1] != dots[i][1]) {
                column = Math.abs(dots[0][1] - dots[i][1]);
                break;
            }
        }
        
        return column * row;
    }
}