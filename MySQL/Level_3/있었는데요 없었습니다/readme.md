# 있었는데요 없었습니다
풀이일자 : 2023. 04. 04.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59043
    
풀이방식    

    보호시작일보다 입양일이 더 빠른 경우를 찾아야하는데
    그러면 보호도 되었고 입양도 된 동물이니까
    INNER JOIN으로 해주었고
    ANIMAL_ID로 JOIN해주면 되니까
    FROM ANIMAL_INS A JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
    로 조인해주었음

    보호시작일보다 입양일이 빨아야 하니까 WHERE에 조건으로
    WHERE A.DATETIME > B.DATETIME으로 해두었고
    보호 시작일이 빠른 순서로 출력해야하니까
    ORDER BY A.DATETIME ASC로 설정함

기억해둘 것  
    
    null