# 가격이 제일 비싼 식품의 정보 출력하기
풀이일자 : 2023. 04. 03.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131115
    
풀이방식    

   두 가지 방식이 있음
   하나는 ORDER BY PRICE DESC로 가격이 가장 높은 것부터 오게 정렬하고 LIMIT 1로 하나만 출력하는 방법(이렇게 풀었음)
   다른 하나는 정직하게 PRICE가 MAX(PRICE) 값과 일치하는지 확인하는 방법
   그래서 WHERE에
   PRICE = (SELECT MAX(PRICE) FROM FOOD_PRODUCT) 라고 SELECT 문에서 나온 결과를 집어넣어서 비교하도록 함

기억해둘 것  
    
   null
