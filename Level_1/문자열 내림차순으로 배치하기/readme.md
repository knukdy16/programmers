# 문자열 내림차순으로 배치하기 
풀이일자 : 2023. 03. 07.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12917  
    
풀이방식    

    Arrays.sort에서 reverse를 추가하는 방식을 쓰면 쉽게 구할 수 있지만
    구문이 너무 길어 외우기 귀찮은 관계로 그냥 Selection Sort로 구현해서
    큰 게 위로 오게 비교시켜서 답이 나오도록 만들었음

    여담이지만 문제에서 대문자는 소문자보다 작은 것으로 간주한다고 했는데
    실제로 ascii에서 대문자는 60번대, 소문자는 90번대에서 시작하므로
    평소에 Sort에서 비교문 만들듯이 그대로 사용해도 무방함


기억해둘 것  
    
    ASCII에서 각 글자의 시작점
    a = 97, A = 65, 0 = 48
