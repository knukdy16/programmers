class Solution {
    boolean[] visited;
    int answer = 0;
    
    public int solution(int[] number) {

        visited = new boolean[number.length];
        dfs(number, number.length, 0, 3);
        
        return answer;
    }
    
    private void dfs(int[] ary, int n, int start, int r) {
        if(r == 0) {
            int temp = 0;
            for(int i = 0; i < n; i++) {
                if(visited[i]) temp += ary[i];
            }
            if(temp == 0) answer++;
        } else {       
            for(int i = start; i < n; i++) {
                if(!visited[i]) {
                   visited[i] = true;
                   dfs(ary, n, i, r - 1);
                   visited[i] = false;
                }
            }
        }
    }
}