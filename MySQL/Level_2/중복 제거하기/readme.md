# 중복 제거하기
풀이일자 : 2023. 04. 02.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59408
    
풀이방식    

    COUNT를 쓰는 건 알았는데 중복을 어떻게 하느냐가 문제라서 결국 검색해봤음
    중복되는 Attribute 값이 있으먄 DISTINCT로 제거 가능하고
    COUNT는 애초에 NULL은 세지 않았음
    우으... 이게 생각이 안나네 ㅠ

기억해둘 것  
    
    중복되는 Attribute 값 제외
    DISTINCT 사용
    select distinct attr1 from table_name;
