# 문자열 뒤집기
풀이일자 : 2023. 01. 05.  
    
레벨 : 0    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120822  
    
풀이방식    

    조금 까다롭긴 한데, 자바는 문자열을 Object 취급하기 때문에 C언어처럼 배열같이 쓸 수 없음
    즉, 한 번 선언되면 변경이 불가능함
    그래서 다른 method를 사용해서 글자를 갖고오는 식으로 해야 함
    나는 String Class에 있는 substring method를 사용했는데, 실제로는 Garbage Collection 문제가 있어서
    StringBuilder 사용을 권장하는 편임
    어쨌든 substring을 사용해서 특정 위치의 글자를 갖고 오고 그걸 하나씩 뒤로 합치는 방식으로
    뒤집힌 문자열을 만들어냈음



기억해둘 것  
    
    substring 사용법
    stringValue.substring(frontIndex, endIndex);
