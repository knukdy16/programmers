# 이진 변환 반복하기
풀이일자 : 2023. 04. 02.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/70129
    
풀이방식    

    간단하게 replaceAll로 0을 전부 제거했고
    method length 써서 String 길이 갖고 오면 이진변환은 늘 했듯이 나머지가 1인지 0인지에 따라
    이진수를 String으로 표현했었음
    그걸 마지막 String이 "1"이 될 때까지 while문으로 돌렸음

    while 문 내부에서 count 값을 증가시켜서 변환 횟수를 증가시켰고
    0의 갯수는 (0을 제거하기 전의 길이) - (0을 제거한 후의 길이)가 0의 갯수가 되니까 그걸로 써먹음

기억해둘 것  
    
    null
