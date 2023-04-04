# 루시와 엘라 찾기
풀이일자 : 2023. 04. 04.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59046
    
풀이방식    

    웨 정규식 안된거지 했는데 더럽게 깐깐한거였고...

    정규식 방식은 나중에 설명하고 처음에 정규식 안 되서 해버린 짓이 전부 OR을 넣는 것이었음...
    문제는 이러면 OR만 해도 겁나 많이 들어가는 귀찮은 구문이 생김

    그래서 사용하는 게 REGEXP였는데 처음에 그냥
    REGEXP "Lucy|Ella|Pickle|Rogan|Sabrina|Mitty" 하니까 안 됐었음
    왜냐하면 이렇게 해버리면 저 단어가 포함되기만 하면 되기 때문에 원하는 대로 검색이 안됨
    저 단어들만 나오게 하려면 처음, 끝임을 나타내서 저 단어만 정확하게 있어야 한다고 표시해야 함
    그래서 ^와 $를 써서 REGEXP "^(Lucy|Ella|Pickle|Rogan|Sabrina|Mitty)$" 로 해야 함

    여담이지만 AND, OR 대신 &&, ||를 써도 됨(이건 내 경험담)

기억해둘 것  
    
    REGEXP로 여러 단어 포함 여부 확인(이 단어 자체만 있어야 하는 경우)
    WHERE attr1 REGEXP "^(단어|단어|...|단어)$"