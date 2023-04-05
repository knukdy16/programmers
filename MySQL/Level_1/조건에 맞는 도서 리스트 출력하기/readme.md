# 조건에 맞는 도서 리스트 출력하기
풀이일자 : 2023. 04. 05.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/144853
    
풀이방식    

    이정도는 금방 풀긴 함
    출판일 출력 포맷 맞춰준다고 DATE_FORMAT(PUBLISHED_DATE, "%Y-%m-%d") 써주고
    2021년 출판된 카테고리 인문 서적 조건은
    WHERE YEAR(PUBLISHED_DATE) = "2021" AND CATEGORY = "인문" 임
    거기에 정렬 조건은 출판일 오름차순 기준이니 ORDER BY PUBLISHED_DATE ASC 로 설정

기억해둘 것  
    
    null