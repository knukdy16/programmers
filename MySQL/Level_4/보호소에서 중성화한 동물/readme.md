# 보호소에서 중성화한 동물
풀이일자 : 2023. 04. 05.  
    
레벨 : 4    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59045
    
풀이방식    

    생각보단 별거 없었음
    보호, 입양 기록 둘 다 있어야 하니까 두 테이블을 INNER JOIN해주고
    REGEXP로 ANIMAL_INS에는 "Intact", ANIMAL_OUTS에는 "Spayed|Neutered" 가 있는지 검사함

기억해둘 것  
    
    null