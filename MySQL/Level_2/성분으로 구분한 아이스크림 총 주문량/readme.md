# 성분으로 구분한 아이스크림 총 주문량
풀이일자 : 2023. 04. 05.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/133026
    
풀이방식    

    INGREDIENT_TYPE 별 TOTAL_ORDER의 합을 구해야 하니 SUM()을 써주고 INGREDIENT_TYPE으로 묶음
    그리고 FIRST_HALF에는 성분 정보가 없으니 ICECREAM_INFO랑 FLAVOR 기준으로 JOIN을 진행
    총 주문량이 작은게 위로 가야하니까 ASC로 정렬

기억해둘 것  
    
    null