# 소수 찾기  
풀이일자 : 2023. 04. 27.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12921
    
풀이방식    

    아? = 조건 빼먹었다...
    귀찮아서 그냥 2부터 n까지 for문 돌려서 소수이면 count함
    근데 처음에 아무 생각없이 2부터 i까지 나눠서 나머지 0인지 아닌지 확인했는데
    그러면 계산량이 무지막지하게 늘어나서 안됨
    문제는 예전에 썼던 sqrt로 계산량 줄이는 방식이 생각이 안났었음;
    그걸 나중에 생각해내서 풀었다는게 함정

    아... 감 다 죽었네

기억해둘 것  
    
    소수 확인 sudo코드
    for(int i = 2; i <= sqrt(n); i++) { if(a % i == 0) break; }
    or
    for(int i = 2; i * i <= n; i++) { if(a % i == 0) break; }