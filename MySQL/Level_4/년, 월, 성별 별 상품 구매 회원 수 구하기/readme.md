# 년, 월, 성별 별 상품 구매 회원 수 구하기
풀이일자 : 2023. 04. 06.  
    
레벨 : 4    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131532
    
풀이방식    

    DISTINCT가 SELECT에서만 쓸 수 있는게 아니었구나... 그거 빼고 다 했음 ㅂㄷㅂㄷ
    (참괴: https://velog.io/@zinu/프로그래머스-년-월-성별-별-상품-구매-회원-수-구하기MySQL)
    
    년도, 월, 성별, 구매한 사람 수 출력을 해야하는데
    구매한 사람에 대해서 같은 사람의 기록이 여러개 있으니까 ID 하나만 갖고와야 하고
    USER_ID만 세주면 되니까 전체적으로
    SELECT YEAR(SALES_DATE) AS YEAR, MONTH(SALES_DATE) AS MONTH, GENDER, COUNT(DISTINCT A.USER_ID) AS USERS
    이렇게 나옴

    JOIN은
    FROM USER_INFO A JOIN ONLINE_SALE B ON A.USER_ID = B.USER_ID
    이렇게 했음

    성별 없는거 제외하고 COUNT 쓰니까 GROUP BY를 해야 하는데
    GROUP BY도 Attribute 여러 개 줄 수 있어서 준 Attribute대로 묶는게 가능함

    그래서 WHERE, GROUP BY 같이 써서 나타내면
    WHERE A.GENDER IS NOT NULL GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), A.GENDER
    가 됨

    정렬은 주어진대로 따라가면 되니까
    ORDER BY YEAR ASC, MONTH ASC, A.GENDER ASC 가 돔

기억해둘 것  
    
    조건 여러 개로 집계하기
    GROUP BY attr1, attr2, attr3 -> attr1, 2, 3별로 합쳐서 집계함

    집계함수에서 안 겹치게 집계하기
    COUNT(DISTINCT attr1) -> attr1에서 겹치는 값 빼고 count해줌