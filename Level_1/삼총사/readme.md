# 삼총사 
풀이일자 : 2023. 03. 23.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131705  
    
풀이방식    

    어... 이거 이렇게 푸는거 아니었어? 다른 방법이 더 정답같아 보이는 느낌
    간단하게 풀려면 어차피 3개끼리만 더하면 되니까 3중 for문을 돌려서 풀었음

    근데 처음에 이렇게 풀까 하기 전에 탐색하듯이 푸는 방법도 생각했다가 for문 돌리는게 짜는 건 더 편해서
    그냥 저렇게 풀었다가 다른 답 보고 dfs로 푼다는 걸 봤음
    dfs면 깊이 우선이니까 재귀함수로 깊이 3까지 계속 파고든다고 생각하면 됨

    dfs이면 내가 탐색한 곳인지 아닌지 확인하기 위해 코드 내부의 visited[]와 같은
    boolean type의 배열이 필요함
    그래서 안 갔던 곳이면 visited를 true로 바꾼 다음 안 갔던 곳에서 다음으로 진행하기 위해
    재귀함수를 활용해서 다시 들어감
    그럼 다 갔다 왔으면, 다음 안 갔던 곳으로 가야 하고 갔던 곳은 다시 가면 안 되니까 false로 끝에 바꿔줌

    어찌보면 dfs 자체가 nCr, 즉 조합처럼 쓰일 수도 있다고 생각할 수 있겠다 

기억해둘 것  
    
    dfs sudo code
    void dfs(ary, n, start, r) { // n, r은 nCr에서의 각각의 n, r에 해당한다고 보면 됨
        if(r == 0) { print("탐색완료") // ary는 여기에서 활용 }
        else { 
            for(int i = start; i < n; i++) {
                if(not visited) { // !visited[i], 필요하면 전역 변수로 생성
                    visited[i] = true;
                    dfs(ary, n, i, r - 1);
                }
            }
        } 
    }
