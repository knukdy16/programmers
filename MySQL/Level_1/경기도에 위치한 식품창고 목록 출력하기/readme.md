# 경기도에 위치한 식품창고 목록 출력하기
풀이일자 : 2023. 04. 02.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131114
    
풀이방식    

   IFNULL을 사용해서 냉동시설 유무가 NULL이면 N으로 표기시키기 위해
   IFNULL(FREEZER_YN, "N") 으로 해주고
   WHERE에서 ADDRESS가 경기도인 것만 오도록
   WHERE ADDRESS LIKE "%경기도%"로 설정함
   정렬도 해줘야 하니까 ORDER BY WAREHOUSE_ID ASC로 해줌

기억해둘 것  
    
   null
