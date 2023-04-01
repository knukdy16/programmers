# 최댓값과 최솟값
풀이일자 : 2023. 03. 28.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12939
    
풀이방식    

    split 쓰는 건 잘 했는데 변수를 잘못 설정했을 줄은 엌
    간단하게 split로 각 숫자를 분리해서 Array로 담아주고
    for문 돌려서 min값과 max 값을 찾았는데
    저장되어 있는 변수는 String 형태이므로 Integer 형태로 변환해서 비교하는 방식으로 진행함

기억해둘 것  
    
    split 사용법
    String[] ary = stringValue.split(" ");
