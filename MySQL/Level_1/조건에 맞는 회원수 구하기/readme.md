# 조건에 맞는 회원수 구하기
풀이일자 : 2023. 04. 03.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131535
    
풀이방식    

    어느 구간 사이에 있는 사람들에 대해 조건을 걸어야 하는데
    여기에 써먹기 편한게 BETWEEN이다
    BETWEEN A AND B이면 A 이상 B 이하에 해당하는 튜플들을 검색함

    그래서 2021년에 가입한 사람이면 JOINED BETWEEN "2021-01-01" AND "2021-12-31" 이고
    20세 이상 29세 이하는 AGE BETWEEN 20 AND 29 가 된다

기억해둘 것  
    
    BETWEEN 사용법
    WHERE attr1 BETWEEN A AND B
