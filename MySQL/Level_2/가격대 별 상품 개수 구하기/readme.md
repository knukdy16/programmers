# 가격대 별 상품 개수 구하기
풀이일자 : 2023. 04. 05.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131530
    
풀이방식    

    갯수를 세야 하니까 COUNT()를 쓰고, PRICE_GROUP의 갯수를 세는 거니까 GROUP BY를 PRICE_GROUP으로 설정
    그리고 정렬도 가격이 낮은게 위로 가야하니까 ORDER BY PRICE_GROUP ASC 로 설정

    PRICE_GROUP을 출력하는게 힘들었는데 생각보다 가격대가 다양했음
    일단 10000단위로 끊어주기 위해 10000으로 나누었는데 소숫점까지 계산되었음
    그래서 버림 함수가 뭔지 검색해보니까 FLOOR()로 나옴
    그러면 10000원대 가격들은 10000으로 나누고 버림하면 1만 나오니까 그걸 활용해서 범위를 나타냈음
    정리하면, PRICE_GROUP 계산은
    (FLOOR(PRICE / 10000) * 10000) AS PRICE_GROUP 로 했음


기억해둘 것  
    
    반올림, 올림, 버림
    ROUND(), CEILING(), FLOOR()