# 오랜 기간 보호한 동물(2)
풀이일자 : 2023. 04. 04.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59411
    
풀이방식    

    간단...하다면 간단한건가
    보호랑 입양 둘 다 되었어야 하니까 INNER JOIN으로 해줘서
    FROM ANIMAL_INS A JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
    까진 간단했는데 ORDER BY가 애매했음
    보호기간을 입양날짜 - 보호시작날짜로 해서 ORDER BY 하면
    ORDER BY (B.DATETIME - A.DATETIME) DESC
    인데 먹힘 에엣?!
    마지막으로 두 마리만 나와야 하니까 LIMIT 2 까지 해서 끝

기억해둘 것  
    
    null