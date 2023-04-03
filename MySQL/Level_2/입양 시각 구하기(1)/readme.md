# 입양 시각 구하기(1)
풀이일자 : 2023. 04. 03.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/59412
    
풀이방식    

   역시 모르면 몸이 고생함 ㄷㄷ
   저번에 문제풀때 썼던 DATE_FORMAT으로 DATE_FORMAT(DATETIME, "%H")라고 써서 시간만 따로 뺐음
   그 다음 09:00부터 19:59 까지니까 BETWEEN 09 AND 19 라고 썼음
   참고로 %h라고 하면 12시 기준이라 24시 기준인 %H로 써야 함

   근데 더 편한건 HOUR를 써서 시간만 추출하는 게 가능했음 그래서
   HOUR(DATETIME)을 써서 더 짧은 길이로 데이터를 추출시켰음
   시간 순으로 정렬해야 하니까 ORDER BY HOUR(DATETIME) ASC 로 정렬함

기억해둘 것  
    
   DATETIME에서 특정 요소만 추출
   (참고: https://extbrain.tistory.com/60)
   YEAR(), MONTH(), DAY(), HOUR(), MINUTE(), SECOND()
   