# 자동차 대여 기록에서 대여중 / 대여 가능 여부 구분하기
풀이일자 : 2023. 04. 06.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/157340
    
풀이방식    

    대여중인지 아닌지 구분하는게 어렵네...
    (참고: https://velog.io/@greaceh/프로그래머스-SQL-자동차-대여-기록에서-대여중-대여-가능-여부-구분하기)

    대여중인 경우는 시작날짜와 종료날짜 사이에 2022-10-16이 들어가는지 봐야 함
    다행인건 START_DATE, END_DATE 둘 다 DATE format이라 형변환은 안해도 됨
    가장 나중에 렌탈이 끝난걸 알아야 하니까 MAX를 사용
    나머지는 MAX 썼으니까 GROUP BY를 써주고, ORDER BY도 ID 내림차순에 따라 적용

기억해둘 것  
    
    null