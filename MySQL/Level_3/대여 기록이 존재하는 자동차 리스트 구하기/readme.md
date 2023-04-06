# 대여 기록이 존재하는 자동차 리스트 구하기
풀이일자 : 2023. 04. 06.  
    
레벨 : 3    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/157341
    
풀이방식    

    철자가 헷갈려서 잘못썼다...
    결과에서 중복되는 Attibute 값을 없애려면 DISTINCT 를 써줘야 함
    차 종류를 갖고오기 위해서 INNER JOIN을 해줬고
    시작날짜가 10월인 차를 갖고오기 위해 BETWEEN을 써주고
    세단인 차 종류 갖고오는건 간단하게 CAR_TYPE = "세단"으로 해주면 끝
    정렬은 ID 내림차순이니까 ORDER BY CAR_ID DESC로 해줌


기억해둘 것  
    
    null