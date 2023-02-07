# 문자열 안에 문자열
풀이일자 : 2023. 01. 20.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120908  
    
풀이방식    

    자바는 신이야
    그냥 contains 써서 풀었음

    하지만... 원래는 이렇게 풀라고 내놓은 문제는 아님 ㅋㅋㅋ
    실제로 문제를 풀려고 한다면, 진행하다가 같은 글자 나오면 거기부터 다시 일치하는 부분이 있는지
    for문 안에 for문이 있는 형태로 구현하는 것이 정석

기억해둘 것  
    
    String에서 특정 부분의 글자를 char type으로 갖고오기
    stringValue.charAt(0); // index에 해당하는 int 값을 대입
