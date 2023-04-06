# 조건에 맞는 사용자 정보 조회하기
풀이일자 : 2023. 04. 06.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/164670
    
풀이방식    

    문자열 합치기는 CONCAT... 몰랐다 ㄷㄷ 길이도 짱 기네
    CONCAT를 써서 전체주소를 이렇게 합침
    CONCAT(CITY, " ", STREET_ADDRESS1, " ", STREET_ADDRESS2) AS 전체주소
    전화번호는 MID를 써서 분리했고, 이렇게 썼음
    CONCAT(MID(TLNO, 1, 3), "-", MID(TLNO, 4, 4), "-", MID(TLNO, 8, 4)) AS 전화번호

    테이블을 합치기 위해 JOIN을 써줬고
    몇 개인지 세기 위해서 USER_ID로 GROUP BY로 묶고 3개 이상 등록한 사람이니까 COUNT로 갯수 세주고
    HAVING COUNT(*) >= 3 으로 조건을 줬음
    정렬은 ID기준 내림차순, ORDER BY USER_ID DESC로 해줌

기억해둘 것  
    
    문자열 합치기
    CONCAT("aaaa", "BBBB", "cccc") -> "aaaaBBBBcccc"로 출력됨