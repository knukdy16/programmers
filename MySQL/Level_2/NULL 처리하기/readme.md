# NULL 처리하기
풀이일자 : 2023. 04. 02.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59410
    
풀이방식    

   와 IF가 떠올랐었다 따봉LoS야 고마워!

   이름이 NULL이면 "No name"을 출력하라고 했었는데
   그러면 NULL인지 확인해야 하니까 IF를 사용해서 IS NULL을 써서 판단해줌
   TRUE이면 "No name", FALSE이면 원래대로 NAME이 결과로 나옴

   인터넷에 보니까 IFNULL로 아예 NULL인지 판단하는 IF가 따로 있었음
   그걸 써줘도 되는데 그러면 앞에는 NULL인지 판단할 Attribute, 뒤에는 NULL인 경우에 출력할 값을 넣어줌

   하지만 난 SQL Injection 문제 풀다보니 IF가 더 익숙한 건 함정

기억해둘 것  
    
   IF 사용법
   IF(조건, TRUE인 경우 출력할 값, FALSE인 경우 출력할 값)
   
   IFNULL 사용법
   IFNULL(attr, "value")
