# 중성화 여부 파악하기
풀이일자 : 2023. 04. 03.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59049
    
풀이방식    

   오... 정규표현식도 있구나

   일단 난 풀이할 때 정규표현식 없이 해서 길어졌는데 간단하게 IF문 써서 조건으로
   SEX_UPON_INTAKE LIKE "%Neutered%" OR SEX_UPON_INTAKE LIKE "%Spayed%"
   요렇게 줘서 문제를 풀었음
   근데 REGEXP로 정규식을 쓰면 길이 단축이 가능했음!
   SEX_UPON_INTAKE REGEXP "Neutered|Spayed" 로 OR을 REGEXP 내부로 옮길 수 있었음
   이거도 기억해둬야겠네...

기억해둘 것  
    
    REGEXP 사용법
    attr1 REGEXP "정규표현식"

    정규표현식 기호
    (참고: https://velog.io/@gillog/MySQL-REGEXPRegular-Expression%EC%A0%95%EA%B7%9C-%ED%91%9C%ED%98%84%EC%8B%9D)
    []: 괄호 안에 나타난 패턴을 찾음, .: 문자 하나, |: or 역할
    ^: ^뒤에 오는 문자열로 시작하는 문자열을 찾음
    $: $앞에 오는 문자열로 끝나는 문자열을 찾음
    *: 0회 이상 반복, +: 1회 이상 반복
    [^"문자열"]: NOT, "문자열"이 포함되지 않은 문자열을 찾음 
   