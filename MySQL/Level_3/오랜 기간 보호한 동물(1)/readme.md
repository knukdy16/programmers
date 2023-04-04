# 오랜 기간 보호한 동물(1)
풀이일자 : 2023. 04. 04.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59044
    
풀이방식    

    어.. JOIN 문제라고 했지만 JOIN 쓰는 법 까먹어서 다르게 풀었던 건 함정

    일단 JOIN 안 쓰고 하는 방식은 Primary Key인 것 같았던 ANIMAL_ID를 사용하는 것이었음
    ANIMAL_OUTS에 없는 ANIMAL_ID를 찾기 위해 WHERE에
    WHERE ANIMAL_ID NOT IN (SELECT ANIMAL_ID FROM ANIMAL_OUTS)
    라고 이중으로 SELECT문을 사용했다
    
    JOIN을 쓰는 경우에는 각 테이블마다 별칭을 지정해서 사용하고
    각 테이블을 Join하기 위해 사용할 Attribute를 정한다
    그래서 FROM부터 Join할 테이블을 지정하는 부분이
    FROM ANIMAL_INS A LEFT JOIN ANIMAL_OUTS B이고
    ON A.ANIMAL_ID = B.ANIMAL_ID 로 JOIN할 Attribute를 정한다
    입양이 안 된 동물에 대해 검색해야 하니까 LEFT JOIN으로 해주었고
    OUTER JOIN이므로 INNER JOIN과 달리 각 테이블의 Attribute가 존재여부 상관없이 모두 합쳐져서 나타니까
    입양 안 된 동물은 B.ANIMAL_ID가 없는 것을 이용한 것임
    그래서 ANIMAL_INS에 있는 것만 찾아야 하니까
    WHERE B.ANIMAL_ID IS NULL를 사용했음
    만약 INNER JOIN을 썼으면 A.ANIMAL_ID랑 B.ANIMAL_ID 둘 다 있느 경우에 대해서만 JOIN을 하기 때문에
    A에는 있고 B에는 없으면 결과에 안 나타나므로 입양된 동물만 나타나는 결과가 나옴

    JOIN을 쓰든 말든 공통적으로 맞춰야 하는 부분인 정렬과 최대 3개 출력을 위해
    ORDER BY DATETIME ASC LIMIT 3
    로 조건을 지정했음

기억해둘 것  
    
    JOIN 사용법
    SELECT A.attr1, B.attr2 FROM table1 A
    JOIN table2 B ON a.attr3 = b.attr3

    INNER JOIN
    조인 조건(ON에 제시된 조건)을 만족하는 것들만 JOIN

    OUTER JOIN(LEFT/RIGHT/FULL JOIN)
    조인 조건에 대한 Attribute에서 한 쪽이(FULL이면 둘 다도) 없으면 NULL로 채워놓고 JOIN

    JOIN 내용 참조
    https://gent.tistory.com/376