# n^2 배열 자르기
풀이일자 : 2023. 04. 10.  
    
레벨 : 2    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/87390

풀이방식

    으어... 규칙이 있으니까 그나마 할 만했는 것 같은 문제
    10^7 때문에 int[]가 아니라 long[]으로 반환하도록 해줬고 거기에 맞춰서
    필요한 변수들도 long으로 선언
    배열을 직접 만들어서 참조하게 되면 오버헤드가 너무 크므로 left, right 구간만 계산하도록 구현함

    min은 각 행의 최솟값, count는 1부터 n까지 각 행에 대해 몇 번째 원소를 참조하는지를 의미
    input은 answer 배열에 집어넣을 원소를 담고 있음
    여기에서 count를 1부터 시작한 이유는 각 행은 1부터 n까지 들어갈 수 있는데
    count로 각 행에 들어갈 값을 설정해줄거라서 1부터 시작하도록 함

    그러면 left에서부터 집어넣어야 하니까 각 행의 최솟값 min은
    left / min + 1 로 해주었는데, 행렬은 1부터 시작하고
    left < n 이면 left / min 은 0이니까 + 1을 해줬음
    count도 마찬가지로 각 행애서 몇 번째인지 알아내기 위해서 left % n으로 해줬고
    left == 0 이면 left % min 은 0이 되는데 1로 사용할거니까 + 1을 해줬음

    그래서 시작할 때 count <= min이면 처음엔 min을 넣어줘야 하니까 input = min이 되고
    아니면 바로 count부터 넣게 함

    예를 들어서 n = 4, left= 7이라면
    count    1  2  3  4

             1  2  3  4
    min  >>  2  2  3  4  <<  left
             3  3  3  4
             4  4  4  4

    인데, count가 그러면 4가 되고 min < count 니까 바로 4부터 input에 넣어서 시작해주면 됨

    그런 식으로 for문 돌려서 주어진 배열 순서대로 넣어야 할 값을 넣어줌
    count가 아직 n보다 작으면 count는 증가하는 대신, input이 count보다 작은 경우만 input을 증가시킴
    count가 n에 도달하면, 다음 행으로 가기 위해 count, min, input을 조정해줌


기억해둘 것  
    
    null