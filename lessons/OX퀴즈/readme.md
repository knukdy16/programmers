# OX퀴즈
풀이일자 : 2023. 01. 19.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120907  
    
풀이방식    

    단순하게 계산식이 맞는지만 판별하는 문제
    먼저 String 배열 안에 있는 문자열 원소에 대해 split해서 숫자, 부호로 분리하고
    +, -에 따라 자바 코드 상에서 String => Int로 숫자를 변환한 후 계산해줌
    그 다음 계산 결과와 split된 문자열 중 맨 마지막(결과값) 값과 일치하는지 확인해서
    정답 배열에 O 또는 X를 대입

기억해둘 것  
    
    null
