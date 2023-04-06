# 서울에 위치한 식당 목록 출력하기
풀이일자 : 2023. 04. 06.  
    
레벨 : 4    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131118
    
풀이방식    

    문제풀 때 진짜 조건 꼼꼼히 봐야겠다...
    반올림은 ROUND를 사용해야 하고
    평균에 대해 소수점 셋째자리에서 반올림이니까
    ROUND(AVG(B.REVIEW_SCORE), 2) AS SCORE 가 되고 AVG에 대해 GROUP BY REST_ID를 해줌
    리뷰 정보랑 가게 정보랑 합쳐야 해서 
    FROM REST_INFO A JOIN REST_REVIEW B ON A.REST_ID = B.REST_ID 로 해주고
    서울에 있는 식당들이라 WHERE ADDRESS LIKE "서울%" 를 해줌
    정렬은 평점, 즐겨찾기 순 내림차순으로 ORDER BY SCORE DESC, FAVORITES DESC 가 됨

기억해둘 것  
    
    반올림, 올림, 버림
    ROUND(), CEILING(), FLOOR()