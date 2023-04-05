# 5월 식품들의 총매출 조회하기
풀이일자 : 2023. 04. 05.  
    
레벨 : 4    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59045
    
풀이방식    

    나와있는대로 그냥 다 해주면 됨
    가장 먼저 두 테이블을 PRODUCT_ID 기준으로 INNER JOIN 해줬고
    TOTAL_SALES는 AMOUNT와 PRICE의 곱의 SUM()으로 해주고 PRODUCT_ID로 GROUP BY 해줌
    22년 5월 생산분이니까 조건은 PRODUCE_DATE BETWEEN "2022-05-01" AND "2022-05-31" 로 해줌
    정렬은 총 판매량 내림차순, ID 오름차순이니까 순서대로 ORDER BY TOTAL_SALES DESC, A.PRODUCT_ID ASC 로 해줌

기억해둘 것  
    
    null