# 조건에 맞는 사용자와 총 거래금액 조회하기
풀이일자 : 2023. 04. 05.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/164668
    
풀이방식    

    아나... 이상인데 초과로 하고 있었네 ㅂㄷㅂㄷ

    일단 두 테이블을 합쳐야 하니까 INNER JOIN으로 해줬는데 Attribute 이름이 딱히 겹치는게 없어서
    별칭 선언은 따로 안하고 진행함
    TOTAL_SALES는 SUM(PRICE)로 해주고 WHERE STATUS = "DONE"으로 설정해서 거래완료된 것만 합치게 하고
    USER_ID로 GROUP BY를 해주고 70만원 이상이니까 HAVING TOTAL_SALES >= 700000 으로 해줬음
    정렬은 ORDER BY TOTAL_SALES ASC로 해줌


기억해둘 것  
    
    null