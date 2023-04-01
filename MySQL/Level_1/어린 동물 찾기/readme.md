# 어린 동물 찾기 
풀이일자 : 2023. 04. 01.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59037
    
풀이방식    

    where 절을 사용하라는 문제인데 젊은 동물은 "Aged"가 아니면 되니까
    where INTAKE_CONDITION != "Aged"로 해주면 됨
    참고로 SQL은 ==가 아니라 =를 씀! 나도 종종 헷갈려서 이거 기억해둬야 함

기억해둘 것  
    
    where 조건 사용
    where attribute_1 = "blah" or attribute_2 != "nah" and attribute_3 is not null 
        or attribute_4 = (/* select문 */) ...
    
