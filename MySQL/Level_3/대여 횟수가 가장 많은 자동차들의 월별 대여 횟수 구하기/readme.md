# 대여 횟수가 가장 많은 자동차들의 월별 대여 횟수 구하기
풀이일자 : 2023. 04. 07.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/151139
    
풀이방식    

    코드가 더러워... 어휴
    (참고: https://velog.io/@dl-00-e8/Programmers-대여-횟수가-많은-자동차들의-월별-대여-횟수-구하기)
    개월 별, ID, CAR_ID 갯수를 count해서 출력하기 위해서
    SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(CAR_ID) AS RECORDS
    로 주면 되고
    총 대여횟수가 5회 이상인 자동차들을 찾으려면 서브 쿼리로 따로 찾아줘야한다
    그래서 해당 CAR_ID를 찾는 서브 쿼리를 선언해서
    WHERE CAR_ID IN (
        SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
        WHERE START_DATE BETWEEN "2022-08-01" AND "2022-10-31" 
        GROUP BY CAR_ID HAVING COUNT(*) >= 5
    )
    이렇게 되고
    해당 CAR_ID에 대해서만 찾았다고 해도 원래 쿼리에서는 그 날짜에 해당하는 값들만 나오는게 아니고
    해당 CAR_ID이기만 하면 다 출력되니까
    추가로 또 날짜 조건을 뒤에 이어서
    AND START_DATE BETWEEN "2022-08-01" AND "2022-10-31"
    로 달아줘야 한다

    그리고 MONTH, CAR_ID 별로 출력해야 하니까 GROUP BY로 묶어주고
    HAVING으로 CAR_ID가 있는 것만 나오게 HAVING COUNT(CAR_ID) >= 1 로 해준다
    정렬은 월별 오름차순, ID별 내림차순이니까 ORDER BY MONTH ASC, CAR_ID DESC 로 해줌

    참... 할말은 많지만 바쁘니까 참는다

기억해둘 것  
    
    null