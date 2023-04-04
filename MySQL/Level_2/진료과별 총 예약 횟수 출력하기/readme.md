# 진료과별 총 예약 횟수 출력하기
풀이일자 : 2023. 04. 04.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/132202
    
풀이방식    

   생각보다 별 건 없고 GROUP BY만 잘 해주면 됨
   진료과별로 환자 수를 세야 하니까 SELECT에서 집계함수 COUNT를 사용했고
   GROUP BY MCDP_CD로 진료과별로 묶었음
   2022년 5월 예약 환자니까 WHERE에서 조건으로 
   WHERE APNT_YMD BETWEEN "2022-05-01" AND "2022-05-31" 로 줬음
   정렬은 예약 환자 수, 진료과 이름 순서로 오름차순 정렬이니까
   ORDER BY 5월예약건수 ASC, MCDP_CD ASC 로 해줌

기억해둘 것  
    
   null