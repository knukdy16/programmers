# 가장 비싼 상품 구하기
풀이일자 : 2023. 04. 01.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131697
    
풀이방식    

    오 집계함수인가
    문제 조건에 맞는 집계 함수를 호출해서 푸는 문제인데
    가장 비싼 걸 찾아야 하니까 가격이 최대인 걸 찾으면 됨
    그러면 최대인 걸 찾는 집계 함수는 MAX니까 가격에 대한 Attribute는 PRICE이므로
    MAX(PRICE) 요렇게 선언해줌
    근데 속성 이름도 다르게 선언해줘야 하는데 그럴 땐 AS 키워드로 Attribute를 다른 이름으로 표시해줌
    그러면 MAX(PRICE) AS MAX_PRICE 로 써주면 됨

기억해둘 것  
    
    Attribute 이름 다르게 출력해주기
    select attr1 as attr2 -> 결과에는 attr1이 attr2로 출력됨

    Aggregate Functions(집계 함수)
    주어진 속성에 대해 호출한 연산들을 실행
    => group by를 지정해주면 그룹 당 묶어서 여러 결과가 나오고 따로 안 하면 전체에 대해 계산해서 결과 한 개만 나옴

    Aggregate Functions 종류
    sum, max, min, avg, count

    group by, having
    집계 함수 사용 시 특정 그룹 단위로 묶기 위해 사용
    having을 통해 집계 함수 결과에 대해 조건에 따라 출력시킬 수 있음
    group by attr1 having avg(attr2) > 100
    이런 경우 attr1별로 그룹을 묶고
    출력해줄 때 각 그룹에 있는 attr2 값들에 대한 평균이 100 초과인 것만 출력시킨다는 의미임
