# 3월에 태어난 여성 회원 목록 출력하기
풀이일자 : 2023. 04. 04.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131120
    
풀이방식    

    일단 DATE_OF_BIRTH 출력 포맷 맞춰줘야 해서
    DATE_FORMAT(DATE_OF_BIRTH, "%Y-%m-%d") AS DATE_OF_BIRTH 로 맞춰주고
    생일이 3월인 여성 회원에 전화번호가 없는 경우는 제외니까
    WHERE MONTH(DATE_OF_BIRTH) = "03" AND GENDER = "W" AND TLNO IS NOT NULL 로 해줌
    여기에서 3월만 빼내기 위해서 MONTH()를 썼음
    마지막으로 회원ID 기준 오름차순 정렬이니까 ORDER BY MEMBER_ID ASC로 해줌

기억해둘 것  
    
    null