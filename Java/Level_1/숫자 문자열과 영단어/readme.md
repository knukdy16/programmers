# 숫자 문자열과 영단어
풀이일자 : 2023. 03. 28.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/81301

2021 카카오 채용연계형 인턴십 문제
    
풀이방식    

    replace 실수 무엇...
    풀이 자체는 카카오인 것 치고(?) 크게 어렵진 않았음
    zero부터 nine까지 담은 String 배열 하나 만든 다음에 for문 돌려서 replace 또는 replaceAll 해서
    모두 숫자로 바꾼 다음 String => Integer로 변환하는 방식으로 풀이
    
    근데 여기서 헷갈렸던게, replace 해주고 그 결과가 바로 변수에 저장되는 것이 아니라서
    = 를 써서 결과를 넘겨줘야 했음 그걸 까먹었다니 ㅂㄷ


기억해둘 것  
    
    replace 사용법
    stringValue = stringValue.replace(before, after);
    stringValue = stringValue.replaceAll(before, after);
