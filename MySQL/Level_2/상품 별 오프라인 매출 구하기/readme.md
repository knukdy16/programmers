# 상품 별 오프라인 매출 구하기
풀이일자 : 2023. 04. 04.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131533
    
풀이방식    

    판매한 상품에 대한 정보가 필요하니까 INNER JOIN으로 해주었고
    SALES는 A.PRICE * SUM(B.SALES_AMOUNT) 로 해서 총 판매량과 가격을 곱해버렸음
    INNER JOIN은
    FROM PRODUCT A JOIN OFFLINE_SALE B ON A.PRODUCT_ID = B.PRODUCT_ID 로 해주었고
    PRODUCT_ID별 판매량을 계산하기 위해서 GROUP BY B.PRODUCT_ID 로 해주었고 이건 SUM에서 쓰임
    매출액 내림차순, 상품코드 오름차순 순서대로 ORDER BY SALES DESC, A.PRODUCT_CODE ASC 가 된다

    JOIN 없이 콤마만 써서 Equi Join으로 푸는 것도 가능함
    WHERE을 써서
    FROM PRODUCT A, OFFLINE_SALE B WHERE A.PRODUCT_ID = B.PRODUCT_ID 로 Join해주고
    SUM(A.PRICE * B.SALES_AMOUNT)을 사용해서 각 판매량에 대한 판매액의 총합으로 계산하는 식임


기억해둘 것  
    
    WHERE로 JOIN하기(Equi Join)
    FROM table1 A, table2 B WHERE table1.attr = table2.attr