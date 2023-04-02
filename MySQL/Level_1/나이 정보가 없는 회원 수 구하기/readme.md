# 나이 정보가 없는 회원 수 구하기
풀이일자 : 2023. 04. 02.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131528
    
풀이방식    

   풀이방법이 다양했구나...
   Attribute AGE랑 COUNT에 사로잡혀서 답을 이상하게 떠올렸는데
   COUNT는 NULL이 아닌 것만 세니까 (전체 갯수 - NULL이 아닌 것들의 갯수) 이런 식으로 계산했음

   근데 그거 말고도 다양한 방법이 있었는데
   SUM을 활용해서 NULL인 것만 세는 방식도 있었고
   전체 갯수를 세고 WHERE로 AGE가 NULL인 것만 세는 방식도 있음
   
기억해둘 것  
    
    집계함수에 조건 걸기
    SUM(attr1 IS NULL)
    이런 식으로 기준 Attribute에 대해 IS NULL, IS NOT NULL 조건을 줄 수 있음
