# 카테고리 별 도서 판매량 집계하기
풀이일자 : 2023. 04. 04.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/144855
    
풀이방식    

    이번에도 INNER JOIN으로 책 정보와 판매 테이블을 Join해주고 시작함
    그래서 FROM BOOK A JOIN BOOK_SALES B ON A.BOOK_ID = B.BOOK_ID 로 Inner Join해주고
    WHERE에서 판매기간을 BETWEEN으로 설정하면
    WHERE B.SALES_DATE BETWEEN "2022-01-01" AND "2022-01-31" 가 된다
    거기에서 GROUP BY로 카테고리 단위로 묶고 카테고리 순서대로 오름차순 출력을 하려면
    GROUP BY A.CATEGORY ORDER BY A.CATEGORY ASC 가 된다
    출력하는 건 카테고리랑 판매된 책의 총합이라
    A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES로 설정해주고 결과값이랑 맞춰줬음

기억해둘 것  
    
    null