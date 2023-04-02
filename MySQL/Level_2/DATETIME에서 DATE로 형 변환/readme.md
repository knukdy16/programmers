# DATETIME에서 DATE로 형 변환
풀이일자 : 2023. 04. 02.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59414
    
풀이방식    

   와... 이건 ㄹㅇ 모르면 못 푸는 문제네
   DATETIME에서 DATE로 변환하려면 DATE_FORMAT() 함수를 사용해주어야 하는데
   앞에는 형식을 변경할 Attribute를, 뒤에는 포맷을 String 형태로 넣어주어야 함
   yyyy-mm-dd 형식으로 출력해주기 위해선 "%Y-%m-%d" 이렇게 해주어야 함
   나머지는 조건에 맞게 ORDER BY 넣어주고 AS로 Attribute 이름을 조건에 맞게 설정해줌

기억해둘 것  
    
   DATE_FORMAT 사용법
   DATE_FORMAT(attr, "포맷스트링")

   DATE 형식
   %Y: yyyy, %y: yy, %m: mm, %d: dd
   
   참고: https://velog.io/@donghoim/MySQL-DATETIME-%EC%9B%90%ED%95%98%EB%8A%94-%EC%9C%A0%ED%98%95%EC%9C%BC%EB%A1%9C-%EB%B3%80%EA%B2%BD-YYMMDD
