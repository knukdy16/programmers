# k의 개수
풀이일자 : 2023. 02. 06.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120887  
    
풀이방식    

    글자 수 세는 방식을 for문으로 count하는 방식 말고 다른 방법으로 해봤음
    (참고: https://hianna.tistory.com/540)
    간단하게 설명하자면 전체 문자열의 길이랑 특정 문자를 제외한 문자열의 길이를 빼면
    포함된 특정 문자의 갯수가 나온다는 것임
    그걸 활용해서 간단하게 특정 숫자의 갯수를 count해서 풀이

기억해둘 것  
    
    문자열에 포함된 특정 문자의 갯수 구하는 방법
    str.length() - str.replace("포함된 특정 문자", "").length()
