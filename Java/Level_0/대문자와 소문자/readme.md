# 대문자와 소문자
풀이일자 : 2023. 01. 16.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120893  
    
풀이방식    

    아스키코드를 활용했음
    각 글자가 a의 값인 97보다 큰지 작은지에 따라 toLowerCase, toUpperCase 사용

기억해둘 것  
    
    ASCII에서 각 글자의 시작점
    a = 97, A = 65, 0 = 48

    String => Char
    stringValue.charAt(index); // index는 0부터 시작

    대소문자 변경
    stringValue.toLowerCase(); stringValue.toUpperCase();
