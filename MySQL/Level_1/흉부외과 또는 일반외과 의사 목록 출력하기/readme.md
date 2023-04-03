# 흉부외과 또는 일반외과 의사 목록 출력하기
풀이일자 : 2023. 04. 03.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/132203
    
풀이방식    

    날짜 포맷 무엇...
    HIRE_YMD는 년월일만 출력해야하니까 DATE_FORMAT을 써서
    DATE_FORMAT(HIRE_YMD, "%Y-%m-%d") AS HIRE_YMD
    라고 해주었고, CS나 GS만 나와야 하니까
    WHERE MCDP_CD = "CS" OR MCDP_CD = "GS" 을 써줌
    거기에 기본적으로 고용일자 순 정렬이니까 HIRE_YMD DESC를 해주고
    겹치면 이름 순 정렬이니까 그 뒤에 DR_NAME ASC를 추가

기억해둘 것  
    
    null