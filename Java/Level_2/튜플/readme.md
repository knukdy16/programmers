# 튜플
풀이일자 : 2023. 04. 10.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/12949

2019 카카오 개발자 겨울 인턴십 문제

풀이방식

    역시 자바는 신이야

    더러워보이지만 String => String[] => Sorting => ArrayList에 저장 => int[]로 저장
    이런 순서로 진행했음

    String을 String[]으로 변환하기 위해서
    먼저 substring, replaceAll을 써서 중괄호를 없애고
    .split()를 써서 String[]으로 각 튜플들을 분리해서 넣음

    그다음 Sorting을 해야하는데, Sorting하는 기준은
    튜플에 포함된 원소가 작은 게 앞으로 가야함
    근데 String만 가지고는 그걸 모르니까
    따로 원소 갯수가 들어있는 배열을 만들어서 사용함

    그래서 원소 갯수를 따로 센 배열을 가지고 String[]을 정렬해주고
    ArrayList를 활용해서 String[]의 각 원소 String에 있는 숫자들에 대해
    ArrayList에 중복되지 않게 넣어주면 됨
    생각해보니까 HashSet 썼으면 더 간단하게 가능할거같긴 함

    그렇게 해서 ArrayList에 담긴 순서대로 다시 정답 배열에 넣어줘서 끝냄

    와... 자바였으니까 이정도로 풀었지 아니었으면... ㄷㄷ

기억해둘 것  
    
    null