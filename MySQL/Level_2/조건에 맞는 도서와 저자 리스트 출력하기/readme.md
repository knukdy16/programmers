# 조건에 맞는 도서와 저자 리스트 출력하기
풀이일자 : 2023. 04. 05.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/144854
    
풀이방식    

    출력양식 맞춰주는게 ㄹㅇ 제일 귀찮음...
    두 테이블을 JOIN해준 다음 카테고리가 경제인 값만 가져오고 출판 날짜 순으로 정렬
    그래서
    FROM BOOK A JOIN AUTHOR B ON A.AUTHOR_ID = B.AUTHOR_ID WHERE A.CATEGORY = "경제" 
    ORDER BY A.PUBLISHED_DATE ASC
    가 된다
    날짜 포맷은 늘 그렇듯
    DATE_FORMAT(A.PUBLISHED_DATE, "%Y-%m-%d") AS PUBLISHED_DATE
    로 수정해서 맞췄음

기억해둘 것  
    
    null