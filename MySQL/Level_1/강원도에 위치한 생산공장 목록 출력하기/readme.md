# 강원도에 위치한 생산공장 목록 출력하기
풀이일자 : 2023. 04. 02.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/131112
    
풀이방식    

   실습때 이후로 오랜만에 보는 LIKE다...
   특정 구문이 포함되어 있는지 확인하기 위해선 LIKE와 %를 사용함
   그래서 WHERE ADDRESS LIKE "강원도%"
   라고 정의해서 주소가 강원도로 시작하는 튜플들만 검색함
   공장 아이디로 오름차순 정렬이니까 ORDER BY FACTORY_ID ASC로 정렬도 해줌 

기억해둘 것  
    
    LIKE 사용법
    %는 글자 수를정하지 않고, _는 글자 수가 정해져 있는 개념
    그래서 ___이면 글자 세 개가 있다는 의미
    
    WHERE attr1 LIKE "%blah%" -> ~~~blah~~~ 형태
    앞에 %가 없으면 blah~~~, 뒤에 %가 없으면 ~~~blah 형태임

    WHERE attr2 LIKE "__blah__" -> AAblahAA처럼 앞뒤로 두 글자가 있는 것을 찾음
    앞뒤로 없는 경우는 %에서의 케이스랑 같음
