# 12세 이하인 여자 환자 목록 출력하기
풀이일자 : 2023. 04. 03.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/132201
    
풀이방식    

    12세 이하 여자환자 조건은
    WHERE AGE <= 12 AND GEND_CD = "W" 로 해주고
    전화번호가 없는 경우 처리를 위해
    IFNULL(TLNO, "NONE") AS TLNO 를 활용했음
    ORDER BY는 나이 기준 내림차순, 같으면 환자이름 기준 오름차순 정렬이니까
    ORDER BY AGE DESC, PT_NAME ASC로 해줌

기억해둘 것  
    
    null