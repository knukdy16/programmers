# 컨트롤 제트
풀이일자 : 2023. 01. 13.  
    
레벨 : 0   

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120853  
    
풀이방식    

    그... 공백 기준으로 분리하는게 기억이 안 났었는데 split 써서 배열 형태로 분리시키면 그 다음부턴 쉬움
    일단 처음에 숫자 나오면 다 더해주다가, 만약 앞에 Z가 있으면 다시 숫자를 빼주고
    다음에는 Z에 안 걸리게끔 index를 조정하는 방식으로 해결

기억해둘 것  
    
    문자열 분리
    split 사용
    String[] newStringValue = stringValue.split(" "); // 정규식 사용 가능 
