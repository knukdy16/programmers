# 중앙값 구하기
풀이일자 : 2023. 01. 03.  
    
레벨 : 0    

URL : https://school.programmers.co.kr/learn/courses/30/lessons/120811  
    
풀이방식    

    진짜 간단하게 그냥 sort한 다음 중앙에 있는 값을 보여주면 됨
    문제는 처음에 귀찮아서 Arrays.sort를 했는데 안 먹혔...
    어쩔 수 없이 그나마 짜기 간단한 selection sort를 억지로 짰는데 이거도 기억 안나서 자료 찾아봄
    근데 정렬만 하면 그냥 array 중앙에 있는 값만 출력해주면 되는 문제임
    그저 sort를 어떻게 처리했느냐가... 큰 문제이지
    여담이지만 적어둔 sudo 코드처럼 하면 계속 switch를 하니까 가능하면 최종 index값만 저장하고
    마지막에 최종적으로 바꿀 index에 있는 거랑 i에 있는거랑 바꾸는 식으로 하면 리소스를 아낄 수 있음

    Arrays 왜 안된건지 싶어서 보니까 import 문제였... import java.util.Arrays; 해주면 사용 가능


기억해둘 것  
    
    Selection Sort
    i 번째부터 끝까지 탐색해서 최소값을 찾고, 이를 i번째에 자리에 넣어줌
    Selection Sort sudo code
    for(int i = 0; i < length; i++) {
        for(int j = i; j < length; j++) {
            if(ary[i] > ary[j]) switch(ary[i], ary[j]);
        }
    }
