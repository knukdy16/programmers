# 없어진 기록 찾기
풀이일자 : 2023. 04. 05.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59042
    
풀이방식    

    아낰ㅋㅋㅋㅋ 반대로 풀었었네
    입양기록은 있는데 보호소 들어온 기록이 없는걸 찾아야하니까
    ANIMAL_OUTS를 기준으로 JOIN해줬음 그래서
    FROM ANIMAL_OUTS A LEFT JOIN ANIMAL_INS B ON A.ANIMAL_ID = B.ANIMAL_ID 가 됐고
    보호소 들어온 기록이 없는지 확인해야 하니까 WHERE B.ANIMAL_ID IS NULL 를 써줌
    정렬은 ID 오름차순이니까 ORDER BY ANIMAL_ID ASC 로 해줌

기억해둘 것  
    
    null