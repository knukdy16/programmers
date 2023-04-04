# 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
풀이일자 : 2023. 04. 04.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/151137
    
풀이방식    

    정규식 개꿀~
    종류별 해당하는 차의 갯수를 세야 하니까 집계함수로 COUNT를 사용했고 묶는건
    GROUP BY CAR_TYPE으로 해줬음
    통풍시트, 열선시트, 가죽시트 중 하나 이상 있어야 하니까 이건 REGEXP로 처리했고
    WHERE OPTIONS REGEXP "통풍시트|열선시트|가죽시트" 로 해줬음
    자동차종류 기준 오름차순 정렬이니까 ORDER BY CAR_TYPE ASC로 끝냄


기억해둘 것  
    
    null