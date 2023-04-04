# 조건에 부합하는 중고거래 댓글 조회하기
풀이일자 : 2023. 04. 04.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/164673
    
풀이방식    

    에에... 이게 정녕 레벨 1? 5252... 이 녀석 꽤 강한 거 아니냐구?
    너무 길어서 정답 SQL 파일도 가독성 때문에 끊어서 썼음 ㄷㄷ

    먼저 중고거래글에 있는 댓글에 대해서만 해야하니까
    거래글도 있어야 하고 댓글도 있어야함
    그래서 INNER JOIN으로 해주었고 조건은 BOARD_ID가 같은지로 설정해줘야 했고 JOIN 하는 부분 자체는 FROM부터
    FROM USED_GOODS_BOARD A JOIN USED_GOODS_REPLY B ON A.BOARD_ID = B.BOARD_ID
    로 나옴 개길어...
    10월에 작성한 게시물이어야 하니까 WHERE과 BETWEEN으로
    WHERE A.CREATED_DATE BETWEEN "2022-10-01" AND "2022-10-31" 가 된다
    1순위로 댓글 작성날짜, 작성날짜가 같으면 게시글 순서대로 둘 다 오름차순 정렬을 해줘서 
    ORDER BY B.CREATED_DATE ASC, A.TITLE ASC 가 된다

    문제 풀다가 틀렸다고 나올 때 뭐가 이상한거지 싶었는데
    또 포맷 이슈가 있었음...
    작성날짜도 yyyy-mm-dd 맞춰준다고
    DATE_FORMAT(B.CREATED_DATE, "%Y-%m-%d") AS CREATED_DATE 로 다시 SELECT했음 ㅂㄷㅂㄷ

기억해둘 것  
    
    null