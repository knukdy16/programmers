# 식품분류별 가장 비싼 식품의 정보 조회하기
풀이일자 : 2023. 04. 05.  
    
레벨 : 4    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131116
    
풀이방식    

    ??? 뭐지? 같은 방식으로 했는데 아까는 에러 났는데 지금은 된다? 왜이러는데 도대체... 하...

    일단 PRICE는 MAX_PRICE로 별칭을 주고 사용

    가격이 최대값이고 카테고리가 과자, 국, 김치, 식용유인 것만 갖고 와야하니까 이걸 아예 조건으로 사용했음
    그래서 가격이 최대값이려면 WHERE에서
    PRICE IN (SELECT MAX(PRICE) FROM FOOD_PRODUCT GROUP BY CATEGORY) 로 사용했음
    (이상한건 아까 저렇게 했었는데 오류가 났었음... 설마 MAX_PRICE IN 으로 해준게 문제였나)

    카테고리 조건은 정규식 써서 CATEGORY REGEXP "과자|국|김치|식용유" 로 해줌

    내림차순 정렬은 ORDER BY PRICE DESC로 해줌

기억해둘 것  
    
    null