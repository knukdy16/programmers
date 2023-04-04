# 조건별로 분류하여 주문상태 출력하기
풀이일자 : 2023. 04. 04.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131113
    
풀이방식    

    아... 여긴 null이면 처음부터 걍 공백으로 나오는거였구나 ㄷㄷ
    처음에 OUT_DATE가 NULL이면 ""로 나오게 했는데 그거때문에 계속 틀렸음 ㅠ

    일단 내가 푼 방식은 IF문 떡칠로 풀었음
    먼저 날짜 포맷 맞춘다고 DATE_FORMAT(OUT_DATE, "%Y-%m-%d") 로 풀었고
    출고여부는 먼저 IF로 OUT_DATE가 NULL이면 출고미정, 아니면 또 IF문 써서
    2022-05-01보다 앞이면 출고완료, 아니면 출고대기가 나오도록 함
    그래서 정리하면 
    IF(OUT_DATE IS NULL, "출고미정", IF(OUT_DATE <= "2022-05-01", "출고완료", "출고대기")) AS 출고여부
    이렇게 좀 길게 나옴
    정렬은 ORDER_ID 기준 오츰차순이니까 ORDER BY ORDER_ID ASC가 된

    IF문을 안 쓸거면 CASE 문을 사용해주면 됨
    (CASE WHEN OUT_DATE <= "2022-05-01" THEN "출고완료" 
    WHEN OUT_DATE > "2022-05-01" THEN "출고대기"
    ELSE "출고미정" END) AS 출고여부
    이런 식으로 CASE로 시작해서 END로 끝내야 하고 괼호 안에 작성해야 함
    조건은 WHEN 조건식 THEN 결과
    이런 식으로 사용해주면 되고 전부 해당 안되는 경우는 ELSE로 정의해주면 됨

기억해둘 것  
    
    CASE문 사용법 예시
    (CASE WHEN attr1 <= 1 THEN "blah"
    WHEN attr1 < -1 THEN "blahh"
    ELSE "nah" END)