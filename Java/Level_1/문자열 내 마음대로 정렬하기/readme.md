# 문자열 내 마음대로 정렬하기 
풀이일자 : 2023. 03. 27.  
    
레벨 : 1    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12915
    
풀이방식    

    조금 길어보일수도 있지만, 자바의 힘을 빌릴 수 있다면 생각보다 간단하게 풀 수 있음
    주어진 index n을 기준으로 정렬을 진행하는데, 정렬방식은 귀찮아서 Selection Sort로 구현
    이제 비교를 할 때는 각 String에서 index n에 해당하는 글자들을 비교해서 더 큰지 작은지 비교해서
    n에 있는 글자가 더 작으면 앞으로 이동시키게끔 했음
    여기에서 조건이 n에 있는 글자가 같으면 사전 순서대로 정렬하라고 되어 있는데
    여기에서 자바의 String method 중에서 compareTo를 사용해주면 됨(난 왜 compare인줄 알았을까 ㄷ)
    compareTo를 사용해서 만약 비교하는 문자열이 비교대상인 문자열보다 뒤에 있으면 양수를 반환함
    예를 들어서 "abce"에 대해서 "abcd"랑 비교하면 abcd보다 1만큼 뒤에 있으므로 1을 return함
    요런 식으로 비교한다고 보면 됨

기억해둘 것  
    
    compareTo 사용법
    stringValue.compareTo(target);
    stringValue보다 target이 사전 순서의 앞이다 => 양수
    stringValue보다 target이 사전 순서의 뒤이다 => 음수
