# 즐겨찾기가 가장 많은 식당 정보 출력하기
풀이일자 : 2023. 04. 05.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131123
    
풀이방식    

    아... 그냥 MAX로 해주면 안되는구나

    첨에는 그냥 MAX(FAVORITE)를 썼는데, 이러니까 REST_NAME이 안 맞았음
    방법을 몰라서 검색했는데 WHERE 조건으로 각 FOOD_TYPE에서 MAX인 것만 찾아서 해줬음
    즉, FOOD_TYPE, FAVORITES가
    SELECT FOOD_TYPE, MAX(FAVORITES) FROM REST_INFO GROUP BY FOOD_TYPE 에 있는 값들을 써야했음
    그래야 헤당 조건에 맞는 업체들을 불러오기 때문
    아니면 그냥 최상단에 있는 값들을 불러오게 됨

    생각보다 고려해줘야 하는 부분이 많구나 ㄷㄷ

기억해둘 것  
    
    null