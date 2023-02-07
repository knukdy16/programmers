class Solution {
    public int solution(int[][] board) {
        int answer = board.length * board.length;
        int[][] safe = new int[board.length][board.length];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    if(safe[i][j] == 0) { answer--; safe[i][j] = 1; } // 지뢰
                    if(i - 1 > -1 && safe[i - 1][j] == 0) { answer--; safe[i - 1][j] = 1; } // 지뢰 위
                    if(i + 1 < board.length && safe[i + 1][j] == 0) { answer--; safe[i + 1][j] = 1; } // 지뢰 아래
                    if(j - 1 > -1 && safe[i][j - 1] == 0) { answer--; safe[i][j - 1] = 1; } // 지뢰 좌측
                    if(j + 1 < board.length && safe[i][j + 1] == 0) { answer--; safe[i][j + 1] = 1; } // 지뢰 우측
                    if(i - 1 > -1 && j - 1 > -1 && safe[i - 1][j - 1] == 0) { answer--; safe[i - 1][j - 1] = 1; } // 지뢰 좌측 상단
                    if(i + 1 < board.length && j - 1 > -1 && safe[i + 1][j - 1] == 0) { answer--; safe[i + 1][j - 1] = 1; } // 지뢰 좌측 하단
                    if(i - 1 > -1 && j + 1 < board.length && safe[i - 1][j + 1] == 0) { answer--; safe[i - 1][j + 1] = 1; } // 지뢰 우측 상단
                    if(i + 1 < board.length && j + 1 < board.length && safe[i + 1][j + 1] == 0) { answer--; safe[i + 1][j + 1] = 1; } // 지뢰 우측 하단
                }
            }
        }
        
        return answer;
    }
}