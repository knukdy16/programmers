# JadenCase 문자열 만들기
풀이일자 : 2023. 03. 29.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12951
    
풀이방식    

    ??? 아니 이 방식이 안 된다고???
    일단 양심선언 하자면 두 가지 방법으로 생각해서 해봤는데 안 되서 결국 답을 봤고
    완전 똑같은 코드는 아니지만 원리는 이 방식대로 해서 풀었음 하...
    참고: https://mndeveloper.tistory.com/28?category=1035538

    처음에 생각했던 방식은 split로 해서 Upper + Lower한 다음 합쳐서 풀었는데
    이건 공백이 여러 개 나오면 대처가 안 되는 방식이라 패스

    두번째로 생각한 방식은 아예 String에서 해당 단어가 있는 부분만 replace하자는 아이디어였음
    그런데 그렇게 해보니까 일부 case에서 틀렸다고 나왔음...
    문제는 replace로 해서 푼 사람이 한 명도 없었다는거임 구와아아아아아아아아아아악 
    그래서 이렇게 하는건 포기함...

    결국 택한 방식은 처음에 싹 다 Lower case로 바꾸고
    문자열 하나하나에 대해 앞글자인지 판단하는 방식으로 구현 
    앞글자인지 판단하는 방식은 글자 앞에 공백이 있는지 없는지 확인하는 방식으로 했음
    앞에 공백이고 뒤에 글자가 오면 당연히 첫번째로 오는 글자일테니까 대문자로 만들어줘야 했음
    그리고 맨 앞에 글자는 반드시 대문자여야 하니까 for문 돌리기 전부터 대문자로 만들고 시작함

    슈밤바... 오늘도 머리 많이 빠지겠네

기억해둘 것  
    
    null
