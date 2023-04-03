# 짝지어 제거하기
풀이일자 : 2023. 04. 03.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12973
    
풀이방식    

    아... 이거 Stack이구나...
    처음에는 진짜 다 없애야 하는 줄 알고 있었는데 그게 아니었음 ㅠㅠ
    결국 감을 못 잡아서 검색해서 알았다 ㄷㄷ(참고: https://devgeek.tistory.com/35)

    Stack을 활용해서 푸는 문제였는데 각 글자를 Stack에 push해주었다가
    연속된 두 글자가 되는 경우에는 이 둘을 함께 pop시키는 방식이었음
    참고자료를 보니까 Stack 자료형이 따로 있지만 난 사용할 줄 모르니까
    간단하게 배열 하나 만들고 index 변수값을 따로 줘서 사용함
    그래서 push하면 index를 증가시키고, pop하면 index를 감소시켜서 Stack처럼 동작하게 함


기억해둘 것  
    
    Stack 관련 참고: https://velog.io/@woohobi/Stack-%EC%8A%A4%ED%83%9D

    Stack 문제 유형
    괄호문제 처럼 연속으로 나오는 것을 제거하는 문제에서 활용

